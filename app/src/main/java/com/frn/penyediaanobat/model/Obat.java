package com.frn.penyediaanobat.model;

public class Obat {
    private String nama, jenis, gejala1, gejala2, gejala3, komposisi, desc;
    private Integer imageUrl;

    public Obat(String nama,String jenis,String gejala1, String gejala2, String gejala3, String komposisi, String desc, Integer imageUrl) {
        this.nama = nama;
        this.jenis = jenis;
        this.gejala1 = gejala1;
        this.gejala2 = gejala2;
        this.gejala3 = gejala3;
        this.komposisi = komposisi;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getGejala1() {
        return gejala1;
    }

    public void setGejala1(String gejala1) {
        this.gejala1 = gejala1;
    }

    public String getGejala2() {
        return gejala2;
    }

    public void setGejala2(String gejala2) {
        this.gejala2 = gejala2;
    }

    public String getGejala3() {
        return gejala3;
    }

    public void setGejala3(String gejala3) {
        this.gejala3 = gejala3;
    }

    public String getKomposisi() {
        return komposisi;
    }

    public void setKomposisi(String komposisi) {
        this.komposisi = komposisi;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}

