package controller;

public class CustomClass {
    private int num;
    private String str1;
    private double db;
    private String str2;

    public CustomClass(int num, String str1, double db, String str2) {
        this.num = num;
        this.str1 = str1;
        this.db = db;
        this.str2 = str2;
    }

    public CustomClass() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public double getDb() {
        return db;
    }

    public void setDb(double db) {
        this.db = db;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
