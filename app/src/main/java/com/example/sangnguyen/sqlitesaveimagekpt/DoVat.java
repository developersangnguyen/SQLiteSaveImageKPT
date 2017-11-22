package com.example.sangnguyen.sqlitesaveimagekpt;

/**
 * Created by SangNguyen on 10/10/2017.
 */

public class DoVat {
    private int Id;
    private String Ten;
    private String MoTa;
    private byte[] Hinh;

    public DoVat(int id, String ten, String moTa, byte[] hinh) {
        Id = id;
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public byte[] getHinh() {
        return Hinh;
    }

    public void setHinh(byte[] hinh) {
        Hinh = hinh;
    }
}
