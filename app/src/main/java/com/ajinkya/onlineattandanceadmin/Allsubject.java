package com.ajinkya.onlineattandanceadmin;

public class Allsubject {

    String branch,date,name,roll_no,time;

    Allsubject()
    {

    }


    public Allsubject(String branch, String date, String name, String roll_no, String time) {
        this.branch = branch;
        this.date = date;
        this.name = name;
        this.roll_no = roll_no;
        this.time = time;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
