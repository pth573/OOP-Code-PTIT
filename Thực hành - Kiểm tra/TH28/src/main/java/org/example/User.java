package org.example;

public class User
{
    private String user;
    private String pass;

    private int cnt;
    public User(String user, String pass, int cnt) {
        this.user = user;
        this.pass = pass;
        this.cnt = cnt;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}
