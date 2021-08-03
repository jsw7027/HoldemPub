package com.example.holdempub;

public class Trade {

    String userID;
    String ticketName;
    String tradeType;
    int cost;
    int amount;
    String title;


    public Trade(String userID, String title ,String ticketName, int cost,int amount, String tradeType){
        this.userID = userID;
        this.title = title;
        this.ticketName = ticketName;
        this.tradeType = tradeType;
        this.cost = cost;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
