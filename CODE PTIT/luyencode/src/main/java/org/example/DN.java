package org.example;

public class DN implements Comparable<DN>{
    private String id;
    private String ten;
    private int sv;

    public DN(){}

    public DN(String id, String ten, int sv) {
        this.id = id;
        this.ten = ten;
        this.sv = sv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSv() {
        return sv;
    }

    public void setSv(int sv) {
        this.sv = sv;
    }

    @Override
    public String toString(){
        return id + " " + ten + " " + sv;
    }

    @Override
    public int compareTo(DN o) {
        if(sv > o.sv){
            return -1;
        }
        else if(sv < o.sv){
            return  1;
        }
        else{
            return id.compareTo(o.id);
        }
    }
}


