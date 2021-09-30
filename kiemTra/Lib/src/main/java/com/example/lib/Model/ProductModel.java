package com.example.lib.Model;

import java.io.Serializable;

public class ProductModel implements Serializable {
    int Pic;

    public ProductModel(int pic, String name, String phone, String cmnd) {
        Pic = pic;
        Name = name;
        this.phone = phone;
        this.cmnd = cmnd;
    }

    String Name;
    String phone, cmnd;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public ProductModel() {
    }
    public int getPic() {
        return Pic;
    }

    public void setPic(int pic) {
        Pic = pic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
