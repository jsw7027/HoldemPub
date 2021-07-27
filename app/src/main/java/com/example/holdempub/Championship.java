package com.example.holdempub;

public class Championship {

    int poster;
    String name;
    String place;
    String buyin;
    String time;

    public Championship(int poster, String name ,String place, String buyin, String time){

        this.poster = poster;
        this.name=name;
        this.place = place;
        this.buyin = buyin;
        this.time = time;
    }


    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getBuyin() {
        return buyin;
    }

    public void setBuyin(String buyin) {
        this.buyin = buyin;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
