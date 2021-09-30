package com.example.lib.Model;

import java.io.Serializable;

public class user implements Serializable {
    String ten;
    String ngaysinh;
    String sex;


    public int getImgHinh() {
        return imgHinh;
    }

    public void setImgHinh(int imgHinh) {
        this.imgHinh = imgHinh;
    }

    int imgHinh;
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getsCMND() {
        return sCMND;
    }

    public void setsCMND(String sCMND) {
        this.sCMND = sCMND;
    }

    public String getNoiThuongChu() {
        return noiThuongChu;
    }

    public void setNoiThuongChu(String noiThuongChu) {
        this.noiThuongChu = noiThuongChu;
    }

    public String getGiatriden() {
        return giatriden;
    }

    public void setGiatriden(String giatriden) {
        this.giatriden = giatriden;
    }

    String quoctich;
    String que;
    String sCMND;
    String noiThuongChu;
    String giatriden;

    public user() {
    }
    public user(String ten, String ngaysinh, String sex, String quoctich, String que, String sCMND, String noiThuongChu, String giatriden, int imgHinh) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.sex = sex;
        this.quoctich = quoctich;
        this.que = que;
        this.sCMND = sCMND;
        this.noiThuongChu = noiThuongChu;
        this.giatriden = giatriden;
        this.imgHinh = imgHinh;
    }

}
