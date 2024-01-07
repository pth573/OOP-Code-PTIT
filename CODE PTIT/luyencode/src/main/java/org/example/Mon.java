package org.example;

public class Mon {
    private String ma;
    private String ten;
    private int tin;

    public Mon(){}

    public Mon(String ma, String ten, int tin) {
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTin() {
        return tin;
    }

    public void setTin(int tin) {
        this.tin = tin;
    }

}
