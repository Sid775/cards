package com.sid775.cards.services.implemetations;

import com.sid775.cards.entity.Card;
import com.sid775.cards.repositories.CardsRepository;
import com.sid775.cards.services.CardServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService implements CardServiceInterface {

    private final CardsRepository cardsRepository;

    @Autowired
    public CardService(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    @Override
    public List<Card> getAllCardsByCardNumber(String cardNumber) {
        return cardsRepository.findAllByCardNumber(cardNumber);
    }

    @Override
    public List<Card> getAll() {
        return cardsRepository.findAll();
    }

    @Override
    public void save(Card card) {
        cardsRepository.save(card);
    }


}
