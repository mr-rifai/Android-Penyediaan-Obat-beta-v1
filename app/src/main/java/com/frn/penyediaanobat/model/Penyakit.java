package com.frn.penyediaanobat.model;

public class Penyakit {
    private String nama, descp, gejalap1, gejalap2, gejalap3, gejalap4, gejalap5, gejalap6, gejalap7, gejalap8, gejalap9, gejalap10, caraMO, caraMC;
    private Integer imageUrl;

    public Penyakit(String nama, String descp, String gejalap1, String gejalap2, String gejalap3, String gejalap4, String gejalap5, String gejalap6, String gejalap7, String gejalap8, String gejalap9, String gejalap10, String caraMO, String caraMC, Integer imageUrl) {
        this.nama = nama;
        this.descp = descp;
        this.gejalap1 = gejalap1;
        this.gejalap2 = gejalap2;
        this.gejalap3 = gejalap3;
        this.gejalap4 = gejalap4;
        this.gejalap5 = gejalap5;
        this.gejalap6 = gejalap6;
        this.gejalap7 = gejalap7;
        this.gejalap8 = gejalap8;
        this.gejalap9 = gejalap9;
        this.gejalap10 = gejalap10;
        this.caraMO = caraMO;
        this.caraMC = caraMC;
        this.imageUrl = imageUrl;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public String getGejalap1() {
        return gejalap1;
    }

    public void setGejalap1(String gejalap1) {
        this.gejalap1 = gejalap1;
    }

    public String getGejalap2() {
        return gejalap2;
    }

    public void setGejalap2(String gejalap2) {
        this.gejalap2 = gejalap2;
    }

    public String getGejalap3() {
        return gejalap3;
    }

    public void setGejalap3(String gejalap3) {
        this.gejalap3 = gejalap3;
    }

    public String getGejalap4() {
        return gejalap4;
    }

    public void setGejalap4(String gejalap4) {
        this.gejalap4 = gejalap4;
    }

    public String getGejalap5() {
        return gejalap5;
    }

    public void setGejalap5(String gejalap5) {
        this.gejalap5 = gejalap5;
    }

    public String getGejalap6() {
        return gejalap6;
    }

    public void setGejalap6(String gejalap6) {
        this.gejalap6 = gejalap6;
    }

    public String getGejalap7() {
        return gejalap7;
    }

    public void setGejalap7(String gejalap7) {
        this.gejalap7 = gejalap7;
    }

    public String getGejalap8() {
        return gejalap8;
    }

    public void setGejalap8(String gejalap8) {
        this.gejalap8 = gejalap8;
    }

    public String getGejalap9() {
        return gejalap9;
    }

    public void setGejalap9(String gejalap9) {
        this.gejalap9 = gejalap9;
    }

    public String getGejalap10() {
        return gejalap10;
    }

    public void setGejalap10(String gejalap10) {
        this.gejalap10 = gejalap10;
    }

    public String getCaraMO() {
        return caraMO;
    }

    public void setCaraMO(String caraMO) {
        this.caraMO = caraMO;
    }

    public String getCaraMC() {
        return caraMC;
    }

    public void setCaraMC(String caraMC) {
        this.caraMC = caraMC;
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
