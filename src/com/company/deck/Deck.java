package com.company.deck;

import com.company.card.Card;
import com.company.card.CardValueEnum;
import com.company.card.SuitEnum;

import java.util.ArrayList;
import java.util.Collections;

public class Deck implements DeckInterface {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
        for(int i=1; i<14; i++){
            CardValueEnum value = CardValueEnum.values()[i];
            for(int j=0; j<4; j++){
                Card card = new Card(value, SuitEnum.values()[j]);
                this.deck.add(card);
            }
        }
        Collections.shuffle(deck);
    }

    public ArrayList getDeck(){
        return deck;
    }

    //TODO use this instead of the weird (Card) thing
    public Card getCardFromDeck(int index){
        return deck.get(index);
    }
}
