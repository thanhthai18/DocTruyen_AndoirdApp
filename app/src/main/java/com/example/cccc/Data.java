package com.example.cccc;

import com.example.cccc.object.ChapTruyen;
import com.example.cccc.object.TruyenTranh;

import java.util.ArrayList;

public class Data {
    private static Data data;
    static {
        data = new Data();
    }
    public static  Data getData(){
        return data;
    }

    public ArrayList<TruyenTranh> arrTruyenTranhs;

    public void faceData(){
        if(arrTruyenTranhs!=null){
            return;
        }

        arrTruyenTranhs = new ArrayList<>();
        TruyenTranh truyen1 = new TruyenTranh();
        truyen1.id="1";
        truyen1.soChap=2;
        truyen1.LinkAnh="https://cdn-images-1.listennotes.com/podcasts/truy%E1%BB%87n-c%E1%BB%95-t%C3%ADch-hay-nh%E1%BA%A5t-waves-truy%E1%BB%87n-c%E1%BB%95-2hGIlt1PKmS-TpGwux_EFPL.1400x1400.jpg";
        truyen1.tenTruyen="CỔ TÍCH";
        truyen1.tenChap="Số lượng: "+truyen1.soChap;
        truyen1.arrChap = new ArrayList<>();
        ChapTruyen chapTruyen11 = new ChapTruyen("Sự tích Bánh Chưng Bánh Dầy", "Cổ tích\n9 trang");
        chapTruyen11.arrAnh= new ArrayList<>();
        chapTruyen11.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/5/8/story/a.jpg");
        chapTruyen11.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/5/8/story/3908_2a.jpg");
        chapTruyen11.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/5/8/story/3909_2b.jpg");
        chapTruyen11.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/5/8/story/3a.jpg");
        chapTruyen11.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/5/8/story/3912_3b.jpg");
        chapTruyen11.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/5/8/story/4a.jpg");
        chapTruyen11.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/5/8/story/3915_4b.jpg");
        chapTruyen11.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/5/8/story/3917_5a.jpg");
        chapTruyen11.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/5/8/story/3918_5b.jpg");
        ChapTruyen chapTruyen12 = new ChapTruyen("Rùa và thỏ","Cổ tích\n9 trang");
        chapTruyen12.arrAnh= new ArrayList<>();
        chapTruyen12.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/6/0/5/story/bia-a.jpg");
        chapTruyen12.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/6/0/5/story/6822_rua%20va%20tho%201a.jpg");
        chapTruyen12.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/6/0/5/story/6823_rua%20va%20tho%201b.jpg");
        chapTruyen12.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/6/0/5/story/6824_rua%20va%20tho%202a.jpg");
        chapTruyen12.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/6/0/5/story/6825_rua%20va%20tho%202b.jpg");
        chapTruyen12.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/6/0/5/story/6826_rua%20va%20tho%203a.jpg");
        chapTruyen12.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/6/0/5/story/6827_rua%20va%20tho%203b.jpg");
        chapTruyen12.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/6/0/5/story/6828_rua%20va%20tho%204a.jpg");
        chapTruyen12.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/6/0/5/story/rua%20va%20tho%204b.jpg");

        truyen1.arrChap.add(chapTruyen11);
        truyen1.arrChap.add(chapTruyen12);

        arrTruyenTranhs.add(truyen1);

        TruyenTranh truyen2 = new TruyenTranh();
        truyen2.id="2";
        truyen2.soChap=2;
        truyen2.LinkAnh="https://hoctiengduc.com/uploads/BON%20MUA%20TRONG%20NAM.jpg";
        truyen2.tenTruyen="HIỆN ĐẠI";
        truyen2.tenChap="Số lượng: "+truyen2.soChap;
        truyen2.arrChap = new ArrayList<>();
        ChapTruyen chapTruyen21 = new ChapTruyen("Bốn mùa","Hiện đại\n9 trang");
        chapTruyen21.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/0/2/story/bia-a.jpg");
        chapTruyen21.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/0/2/story/2608_trang-2a.jpg");
        chapTruyen21.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/0/2/story/2609_trang-2b.jpg");
        chapTruyen21.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/0/2/story/2611_trang-3a.jpg");
        chapTruyen21.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/0/2/story/2612_trang-3b.jpg");
        chapTruyen21.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/0/2/story/2614_trang-4a.jpg");
        chapTruyen21.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/0/2/story/2615_trang-4b.jpg");
        chapTruyen21.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/0/2/story/2617_trang-5a.jpg");
        chapTruyen21.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/0/2/story/2618_trang-5b.jpg");
        ChapTruyen chapTruyen22 = new ChapTruyen("Chuột con hối lỗi","Hiện đại\n15 trang");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/1a.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/2a.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/2b.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/3a.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/3b.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/4a.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/4b.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/5a.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/5b.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/6a.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/6b.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/7a.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/7b.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/8a.jpg");
        chapTruyen22.arrAnh.add("http://socnhi3.vcmedia.vn/thumb_w/600/truyen/1/9/6/2/story/8b.jpg");

        truyen2.arrChap.add(chapTruyen21);
        truyen2.arrChap.add(chapTruyen22);

        arrTruyenTranhs.add(truyen2);

        TruyenTranh truyen3 = new TruyenTranh();
        truyen3.id="3";
        truyen3.soChap=1;
        truyen3.LinkAnh="https://static.tuoitre.vn/tto/i/s626/2011/08/23/kePw3hFl.jpg";
        truyen3.tenTruyen="DOREMON";
        truyen3.tenChap="Số lượng: "+truyen3.soChap;
        truyen3.arrChap = new ArrayList<>();
        ChapTruyen chapTruyen31 = new ChapTruyen("Cây bút thần kỳ","Fujiko Fujio\n7 trang");
        chapTruyen31.arrAnh.add("http://doctruyendoremon.vn/upload/images/1-2017-11-21.jpg");
        chapTruyen31.arrAnh.add("http://doctruyendoremon.vn/upload/images/2-2017-11-21.jpg");
        chapTruyen31.arrAnh.add("http://doctruyendoremon.vn/upload/images/3-2017-11-21.jpg");
        chapTruyen31.arrAnh.add("http://doctruyendoremon.vn/upload/images/4-2017-11-21.jpg");
        chapTruyen31.arrAnh.add("http://doctruyendoremon.vn/upload/images/5-2017-11-21.jpg");
        chapTruyen31.arrAnh.add("http://doctruyendoremon.vn/upload/images/6-2017-11-21.jpg");
        chapTruyen31.arrAnh.add("http://doctruyendoremon.vn/upload/images/7-2017-11-21.jpg");

        truyen3.arrChap.add(chapTruyen31);

        arrTruyenTranhs.add(truyen3);

        TruyenTranh truyen4 = new TruyenTranh();
        truyen4.id="4";
        truyen4.soChap=2;
        truyen4.LinkAnh="https://tiengtrungthuonghai.vn/wp-content/uploads/2020/04/dbf90b93693629359749570f9f2321f1-e1587375983652.png";
        truyen4.tenTruyen="TRUYỆN CƯỜI";
        truyen4.tenChap="Số lượng: "+truyen3.soChap;
        truyen4.arrChap = new ArrayList<>();
        ChapTruyen chapTruyen41 = new ChapTruyen("Ô Long Viện 1","Yao-Hsing\n6 trang");
        chapTruyen41.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780320311/truyen-tranh-cuoi-o-long-vien/tranh-cuoi-olongvien-tap11/truyen-tranh-cuoi-o-long-vien1.1.jpg");
        chapTruyen41.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780325047/truyen-tranh-cuoi-o-long-vien/tranh-cuoi-olongvien-tap11/truyen-tranh-cuoi-o-long-vien-1.2.jpg");
        chapTruyen41.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780323671/truyen-tranh-cuoi-o-long-vien/tranh-cuoi-olongvien-tap11/truyen-tranh-cuoi-o-long-vien-1.3.jpg");
        chapTruyen41.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780324454/truyen-tranh-cuoi-o-long-vien/tranh-cuoi-olongvien-tap11/truyen-tranh-cuoi-o-long-vien1.5.jpg");
        chapTruyen41.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780321018/truyen-tranh-cuoi-o-long-vien/tranh-cuoi-olongvien-tap11/truyen-tranh-cuoi-o-long-vien1.6.jpg");
        chapTruyen41.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780321935/truyen-tranh-cuoi-o-long-vien/tranh-cuoi-olongvien-tap11/truyen-tranh-cuoi-o-long-vien1.7.jpg");
        ChapTruyen chapTruyen42 = new ChapTruyen("Ô Long Viện 2","Yao-Hsing\n7 trang");
        chapTruyen42.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780318641/truyen-tranh-cuoi-o-long-vien/tranhcuoiolongvien12/truyen-tranh-cuoi-o-long-vien1.9.jpg");
        chapTruyen42.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780319794/truyen-tranh-cuoi-o-long-vien/tranhcuoiolongvien12/truyen-tranh-cuoi-o-long-vien-1.12.jpg");
        chapTruyen42.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780322032/truyen-tranh-cuoi-o-long-vien/tranhcuoiolongvien12/truyen-tranh-cuoi-o-long-vien1.10.jpg");
        chapTruyen42.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780323536/truyen-tranh-cuoi-o-long-vien/tranhcuoiolongvien12/truyen-tranh-cuoi-o-long-vien-1.14.jpg");
        chapTruyen42.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780324072/truyen-tranh-cuoi-o-long-vien/tranhcuoiolongvien12/truyen-tranh-cuoi-o-long-vien1.11.jpg");
        chapTruyen42.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780324525/truyen-tranh-cuoi-o-long-vien/tranhcuoiolongvien12/truyen-tranh-cuoi-o-long-vien-1.15.jpg");
        chapTruyen42.arrAnh.add("https://sites.google.com/site/doctruyencuoihayctp/_/rsrc/1472780325371/truyen-tranh-cuoi-o-long-vien/tranhcuoiolongvien12/truyen-tranh-cuoi-o-long-vien-1.17.jpg");


        truyen4.arrChap.add(chapTruyen41);
        truyen4.arrChap.add(chapTruyen42);

        arrTruyenTranhs.add(truyen4);

    }
}
