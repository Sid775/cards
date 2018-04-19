package com.sid775.cards.controllers;

import com.sid775.cards.entity.Card;
import com.sid775.cards.services.implemetations.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    private final CardService cardService;

    @Autowired
    public Rest(CardService cardService) {
        this.cardService = cardService;
    }

    @RequestMapping("/save")
    public String save(){
        cardService.save(new Card("123456789","22/33","123"));
        return "Done";
    }

    @RequestMapping("/findAll")
    public String findAll(){
        String result = "";

        for (Card card :cardService.getAll()) {
            result += card.toString() + "</br>";
        }
        return result;
    }
}
