package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Room {
    private SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy");

    private String id;
    private String name;
    private String roomName;
    private String dateIn;
    private String dateOut;
    private int total;

    private int totalDate;

    private int sum;

    public Room(){}

    public Room(String id, String name, String roomName, String dateIn, String dateOut, int total) throws ParseException {
        this.id = id;
        this.name = name;
        this.roomName = roomName;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.total = total;

        String[] solve = this.name.split("\\s+");
        this.name = "";
        for(int i = 0; i < solve.length; i++){
            this.name += solve[i].substring(0, 1).toUpperCase() + solve[i].substring(1).toLowerCase() + " ";
        }
        this.name = this.name.trim();

        Date a = x.parse(dateIn);
        Date b = x.parse(dateOut);

        this.totalDate = (int) ((b.getTime() - a.getTime()) / (60 * 1000 * 60 * 24)) + 1;/**/
        int tmp;
        if(roomName.charAt(0) == '1'){
            tmp = 25;
        }
        else if(roomName.charAt(0) == '2'){
            tmp = 34;
        }
        else if(roomName.charAt(0) == '3'){
            tmp = 50;
        }
        else{
            tmp = 80;
        }
        this.sum += totalDate * tmp + total;
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

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + roomName + " " + totalDate + " " + sum;
    }
}
