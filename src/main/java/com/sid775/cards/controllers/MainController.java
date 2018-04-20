package com.sid775.cards.controllers;

import com.sid775.cards.entity.Card;
import com.sid775.cards.repositories.CardsRepository;
import com.sid775.cards.services.implemetations.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    private final CardService cardsService;

    @Autowired
    public MainController(CardService cardsService) {
        this.cardsService = cardsService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getMain(ModelAndView model){

        model.setViewName("index");

        return model;
    }

    @RequestMapping(value = "/saveCard", method = RequestMethod.POST)
    public ModelAndView saveCard(ModelAndView model, @RequestParam String cardNumber, @RequestParam String date,@RequestParam String cvc){
        model.setViewName("index");
        cardsService.save(new Card(cardNumber,date,cvc));
        return model;
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView getAllCards(ModelAndView model){

        model.addObject("allCards",cardsService.getAll());

        model.setViewName("admin");

        return model;
    }

}
