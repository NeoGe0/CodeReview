package com.company.hand;

import com.company.card.Card;

import com.company.deck.Deck;

import java.util.ArrayList;
import java.util.Comparator;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>(5);
    private String handName;

    public Hand(Deck deck, String handName){
        this.handName = handName;

        for(int i=0; i<5; i++){
            Card card = deck.getCardFromDeck((int) (Math.random() * 52));
            this.hand.add(card);
        }
        hand.sort(Comparator.comparingInt(Card::enumToInt));
    }

    //This constructor is for testing purposes. We don't want a random com.company.hand.
    public Hand(ArrayList<Card> hand, String handName){
        this.handName = handName;
        this.hand = hand;
    }

    public String getHandName(){
        return handName;
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public String printHand(){
        StringBuilder toPrint = new StringBuilder();
        for (Card card : hand) {
            toPrint.append(card.cardName());
            toPrint.append("; ");
        }
        return toPrint.toString();
    }

    public void add(int index, Card card){
        hand.add(index, card);
    }
}
