package com.sid775.cards.services;

import com.sid775.cards.entity.Card;

import java.util.List;

public interface CardServiceInterface {

    List<Card> getAllCardsByCardNumber(String cardNumber);

    List<Card> getAll();

    void save(Card card);
}
