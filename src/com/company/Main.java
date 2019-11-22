package com.company;

import com.company.deck.Deck;
import com.company.hand.Hand;
import com.company.handEvaluator.HandEvaluator;

public class Main {

	public static void main(String[] args) {

		//TODO Logic may be off,
//        Hand 1: TWO SPADES; TWO SPADES; FOUR CLUBS; TEN CLUBS; JACK SPADES;
//        Hand 2: THREE HEARTS; SIX CLUBS; SEVEN CLUBS; EIGHT DIAMONDS; QUEEN HEARTS;
//        hand1highest > hand2Highestfalse
//        hand1highest > hand2Highestfalse
//        Hand 2 wins!
//        Can't have 2 * TWO SPADES in a poker game
        HandEvaluator judge = new HandEvaluator();
        Deck deck;
        Hand hand1;
        Hand hand2;
        for (int i = 0; i < 10; i++) {
            deck = new Deck();
            hand1 = new Hand(deck, "Hand 1");
            hand2 = new Hand(deck, "Hand 2");
            System.out.println("Hand 1: " + hand1.printHand());
            System.out.println("Hand 2: " + hand2.printHand());
			System.out.println(judge.evaluate(hand1, hand2).getHandName() + " wins!");
		}
	}
}
