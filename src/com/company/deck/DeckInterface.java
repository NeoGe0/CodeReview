package com.company.deck;

import com.company.card.Card;

import java.util.ArrayList;

public interface DeckInterface {
    public ArrayList getDeck();
    public Card getCardFromDeck(int index);
}
