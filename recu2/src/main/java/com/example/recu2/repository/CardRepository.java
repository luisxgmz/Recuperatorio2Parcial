package com.example.recu2.repository;

import com.example.recu2.model.CardModel;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository <CardModel, Long> {
}
