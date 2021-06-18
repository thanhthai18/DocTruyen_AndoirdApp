package com.example.cccc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.cccc.object.ChapTruyen;
import com.example.cccc.object.TruyenTranh;

import java.util.ArrayList;

public class DocTruyenActivity extends AppCompatActivity {
ImageView imgAnh;
ArrayList<String> arrUrlAnh;
int soTrang,soTrangDangDoc;
TextView txvSoTrang;

EditText edtSoTrang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_truyen);
        init();
        anhXa();
        setUp();
        setClick();
    }
    private void init(){
        Bundle b = getIntent().getBundleExtra("data");
        ChapTruyen chapTruyen = (ChapTruyen) b.getSerializable("chap");
        arrUrlAnh = new ArrayList<>(chapTruyen.arrAnh);
        soTrangDangDoc = 1;
        soTrang = arrUrlAnh.size();
    };
    private float x1,x2;
    static final int MIN_DISTANCE = 150;
    private void anhXa(){
        edtSoTrang = findViewById(R.id.edtSoTrang);
        imgAnh = findViewById(R.id.imgAnh);
        txvSoTrang = findViewById(R.id.txvSoTrang);
    };
    private void setUp(){
        docTheoTrang(0);
    };
    @SuppressLint("ClickableViewAccessibility")
    private void setClick(){
        imgAnh.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        x1 = event.getX();
                        break;
                    case MotionEvent.ACTION_UP:
                        x2 = event.getX();
                        float deltaX = x2 - x1;
                        if (Math.abs(deltaX) > MIN_DISTANCE)
                        {
                            if (x2 < x1)
                            {
                                docTheoTrang(1);
                            }
                            else
                            {
                                docTheoTrang(-1);
                            }
                        }
                        else
                        {

                        }
                        break;
                }
            return true;
            }

        });
        edtSoTrang.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String ss =s.toString().trim();
                if(ss.length()==0){
                    return;
                }
                int num = Integer.parseInt(ss);
                diChuyenDenTrang(num);
            }
        });
    };


    public void right(View view) {
        docTheoTrang(1);
    }

    public void left(View view) {
        docTheoTrang(-1);
    }
private void diChuyenDenTrang(int n){
    soTrangDangDoc=n;
    if (soTrangDangDoc <= 0){
        soTrangDangDoc = 1;
    }
    if(soTrangDangDoc > soTrang){
        soTrangDangDoc = soTrang;
    }
    txvSoTrang.setText(soTrangDangDoc+" / "+soTrang);
    Glide.with(this).load(arrUrlAnh.get(soTrangDangDoc-1)).into(imgAnh);

}
    private void docTheoTrang(int i){
        soTrangDangDoc = soTrangDangDoc + i;
        if (soTrangDangDoc == 0){
            soTrangDangDoc = 1;
        }
        if(soTrangDangDoc > soTrang){
            soTrangDangDoc = soTrang;
        }
        txvSoTrang.setText(soTrangDangDoc+" / "+soTrang);
        Glide.with(this).load(arrUrlAnh.get(soTrangDangDoc-1)).into(imgAnh);
    }
}