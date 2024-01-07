package org.example;

public class People
{
    private String name;
    private String y;
    private String m;
    private String d;

    public People(){}

    public People(String name, String y, String m, String d) {
        this.name = name;
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", y='" + y + '\'' +
                ", m='" + m + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
