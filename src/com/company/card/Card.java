package com.company.card;

public class Card implements CardInterface {
    private SuitEnum suit;
    private CardValueEnum cardValue;

    public Card(CardValueEnum cardValue, SuitEnum suit){
        //TODO 'this' is only used in ambiguous methods such as setters and constructors
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public SuitEnum getSuit(){
        return suit;
    }

    public void setSuit(SuitEnum suit){
        this.suit = suit;
    }

    public CardValueEnum getCardValue(){
        //TODO no need for 'this'
        return cardValue;
    }

    public void setCardValue(CardValueEnum cardValue){
        this.cardValue = cardValue;
    }

    public String cardName(){
        return getCardValue().toString() + " " + getSuit();
    }

    public int enumToInt(){

        return cardValue.getCardValue();
    }
}

