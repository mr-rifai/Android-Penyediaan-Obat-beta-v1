package com.frn.penyediaanobat.model;

public class Covid {
    private String positif;
    private String sembuh;
    private String meninggal;

    public Covid(String positif, String sembuh, String meninggal) {
        this.positif = positif;
        this.sembuh = sembuh;
        this.meninggal = meninggal;
    }

    public String getPositif() {
        return positif;
    }

    public void setPositif(String positif) {
        this.positif = positif;
    }

    public String getSembuh() {
        return sembuh;
    }

    public void setSembuh(String sembuh) {
        this.sembuh = sembuh;
    }

    public String getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(String meninggal) {
        this.meninggal = meninggal;
    }
}