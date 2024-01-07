package org.example;

public class Product
{
    private String id;
    private String name;
    private String group;
    private double buy;
    private double sell;

    public Product(){}

    public Product(String id, String name, String group, double buy, double sell) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.buy = buy;
        this.sell = sell;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f",sell - buy);
    }
}
