package com.example.recu2.service;

import com.example.recu2.model.CardModel;
import com.example.recu2.model.UsuarioModel;
import com.example.recu2.repository.CardRepository;
import com.example.recu2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;

    public ArrayList<CardModel> obtnerCard(){
        return (ArrayList<CardModel>) CardRepository.findAll();

    }
    public  CardModel guardarCard (CardModel card){
        return cardRepository.save(card);
    }


}



