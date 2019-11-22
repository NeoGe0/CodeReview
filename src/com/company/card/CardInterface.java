package com.company.card;

public interface CardInterface {
    //TODO remove public from methods,
    // All abstract, default, and static methods in an interface are implicitly public, so you can omit the public modifier.
    public SuitEnum getSuit();
    public void setSuit(SuitEnum suit);
    public CardValueEnum getCardValue();
    public void setCardValue(CardValueEnum cardValue);
    public String cardName();
    public int enumToInt();
}
