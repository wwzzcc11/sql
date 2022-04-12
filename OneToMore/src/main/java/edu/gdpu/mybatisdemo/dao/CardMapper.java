package edu.gdpu.mybatisdemo.dao;

import edu.gdpu.mybatisdemo.pojo.Card;


public interface CardMapper {

    public void addCard(Card card);

    public void deleteCard(int id);

    public Card queryCardById(int id);
}
