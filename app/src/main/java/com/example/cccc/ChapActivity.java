package com.example.cccc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.cccc.adapter.ChapTruyenAdapter;
import com.example.cccc.object.ChapTruyen;
import com.example.cccc.object.TruyenTranh;

import java.util.ArrayList;

public class ChapActivity extends AppCompatActivity {
    TextView txvTenTruyens;
    ImageView imgAnhTruyens;
    TruyenTranh truyenTranh;
    ListView lsvDanhSachChap;
    ArrayList<ChapTruyen> arrChap;
    ChapTruyenAdapter chapTruyenAdapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap);
        init();
        anhXa();
        setUp();
        setClick();
    }

    private void init() {
        Bundle b = getIntent().getBundleExtra("data");
        truyenTranh = (TruyenTranh) b.getSerializable("truyen");
        arrChap = new ArrayList<>(truyenTranh.arrChap);


        chapTruyenAdapter = new ChapTruyenAdapter(this, 0, arrChap);


    }

    private void anhXa() {
        imgAnhTruyens = findViewById(R.id.imgAnhTruyens);
        txvTenTruyens = findViewById(R.id.txvTenTruyens);
        lsvDanhSachChap = findViewById(R.id.lsvDanhSachChap);


    }

    private void setUp() {
        txvTenTruyens.setText(truyenTranh.getTenTruyen());
        Glide.with(this).load(truyenTranh.getLinkAnh()).into(imgAnhTruyens);

        lsvDanhSachChap.setAdapter(chapTruyenAdapter);

    }

    private void setClick() {
        lsvDanhSachChap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ChapTruyen chap = (ChapTruyen) parent.getItemAtPosition(position);
                Bundle b = new Bundle();
                b.putSerializable("chap", chap);
                Intent intent = new Intent(ChapActivity.this, DocTruyenActivity.class);
                intent.putExtra("data", b);
                startActivity(intent);

            }
        });
    }
}