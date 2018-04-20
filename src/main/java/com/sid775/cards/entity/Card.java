package com.sid775.cards.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table
public class Card implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String cardNumber;

    @Column
    private String date;

    @Column
    private String cvc;

    public Card() {
    }

    public Card(String cardNumber, String date, String cvc) {
        this.cardNumber = cardNumber;
        this.date = date;
        this.cvc = cvc;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", date='" + date + '\'' +
                ", cvc='" + cvc + '\'' +
                '}';
    }
}
