package com.company.hand;

import com.company.card.Card;

import java.util.ArrayList;

public interface HandInterface {
    String getHandName();
    ArrayList getHand();
    String printHand();
    void add(Integer index, Card c);
}
