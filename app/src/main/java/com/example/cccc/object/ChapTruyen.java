package com.example.cccc.object;

import java.io.Serializable;
import java.util.ArrayList;

public class ChapTruyen implements Serializable {
    private  String tenChap,thongTin;
    public ArrayList<String> arrAnh= new ArrayList<>();
    public ChapTruyen(){

    }

    public ChapTruyen(String tenChap, String thongTin){
        this.tenChap = tenChap;
        this.thongTin = thongTin;
    }

    public String getTenChap() {
        return tenChap;
    }

    public void setTenChap(String tenChap) {
        this.tenChap = tenChap;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }




}
