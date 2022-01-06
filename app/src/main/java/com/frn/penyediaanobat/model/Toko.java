package com.frn.penyediaanobat.model;

public class Toko {
   private String nama;
   private String lokasi1;
   private String lokasi2;
   private Integer imageUrl;

    public Toko(String nama, String lokasi1, String lokasi2, Integer imageUrl) {
        this.nama = nama;
        this.lokasi1 = lokasi1;
        this.lokasi2 = lokasi2;
        this.imageUrl = imageUrl;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi1() {
        return lokasi1;
    }

    public void setLokasi(String lokasi1) {
        this.lokasi1 = lokasi1;
    }

    public String getLokasi2() { return lokasi2; }

    public void setLokasi2(String lokasi2) { this.lokasi2 = lokasi2; }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
