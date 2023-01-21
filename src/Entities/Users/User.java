package Entities.Users;

import Entities.Card;

public class User {

    private String name;
    private String lastName;
    private String birthYear;
    private String Ucret;
    private static int id = 5;

    private Card card;



    public User(String name, String lastName, String birthYear, String ucret,Card card) {
        this.name = name;
        this.Ucret = ucret;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.card = card;
        id++;
    }

    public User(String name, String lastName, String birthYear, String s) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.Ucret = s;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        User.id = id;
    }

    public String getUcret() {
        return Ucret;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setUcret(String ucret) {
        Ucret = ucret;
    }
}
