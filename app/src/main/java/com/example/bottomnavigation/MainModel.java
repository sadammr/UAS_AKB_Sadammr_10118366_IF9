package com.example.bottomnavigation;


/*
    Tanggal Pengerjaan  : 11 Agustus 2021
    NIM                 : 10118366
    Nama                : Sadam Mochamad Rifqi
    Kelas               : IF-9

 */




public class MainModel {

    String kota,tempat,turl;

    MainModel()
    {

    }
    public MainModel(String kota, String tempat, String turl ) {
        this.kota = kota;
        this.tempat = tempat;
        this.turl = turl;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String title) {
        this.kota = title;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String image) {
        this.turl = turl;
    }


}


