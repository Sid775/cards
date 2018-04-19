package com.sid775.cards.repositories;

import com.sid775.cards.entity.Card;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface CardsRepository extends CrudRepository<Card,UUID>{

    List<Card> findAllByCardNumber(String cardNumber);

    List<Card> findAll();

}
