package com.example.holdempub;

public class HoldemPub {

    int image;
    String name;
    String open;
    String place;
    String game;

    public HoldemPub(int image, String name, String open, String place, String game){
        this.image = image;
        this.name = name;
        this.open = open;
        this.place = place;
        this.game = game;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }
}
