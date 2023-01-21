package Entities;

import Entities.Users.User;

public class Card {
    public static int id = 0;
    private String cardNo;
    private String balance;
    private int nId;

    public Card(){
        this.cardNo = cardNumber();
        this.balance = "0";
        this.nId = ++id;
    }


    public String cardNumber(){
        String numb;
        numb = "1232311";
        return numb;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        Card.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }
}
