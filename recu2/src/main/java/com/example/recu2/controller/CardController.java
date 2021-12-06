package com.example.recu2.controller;

import com.example.recu2.model.CardModel;
import com.example.recu2.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    CardService cardService;

    @GetMapping()
    public ArrayList<CardModel> obtenerCard(){
        return cardService.obtenercard();

    }
    @PostMapping()
    public CardModel guardarCard(@RequestBody CardModel card){
        return this.cardService.guardarCard(card);
    }


}
