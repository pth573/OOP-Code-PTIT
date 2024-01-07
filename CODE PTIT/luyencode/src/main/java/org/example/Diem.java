package org.example;

public class Diem implements Comparable<Diem>{
    private SV sv;
    private Mon mon;
    private double diem;

    public Diem(){}

    public Diem(SV sv, Mon mon, double diem) {
        this.sv = sv;
        this.mon = mon;
        this.diem = diem;
    }

    public SV getSv() {
        return sv;
    }

    public void setSv(SV sv) {
        this.sv = sv;
    }

    public Mon getMon() {
        return mon;
    }

    public void setMon(Mon mon) {
        this.mon = mon;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public int compareTo(Diem diem) {
        if(mon.getMa().equals(diem.getMon().getMa()))
        {
            return  sv.getMa().compareTo(diem.getSv().getMa());
        }
        else return  mon.getMa().compareTo(diem.getMon().getMa());
    }
}
