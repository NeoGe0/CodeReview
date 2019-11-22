package test.rules.straight;

import com.company.card.Card;
import com.company.card.CardValueEnum;
import com.company.card.SuitEnum;
import com.company.hand.Hand;
import com.company.handEvaluator.HandValues.Straight;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Straight -
 * Hand contains 5 cards with consecutive values.
 * Hands which both contain a straight are ranked by their highest com.company.card.
 */
public class StraightTest {

    /**
     * Test for a straight com.company.hand.
     * Hand 1: 5 cards of consecutive values
     * Hand 2: Five cards of different suit
     * Expected result: Hand 1 wins
     */
    @Test
    public void straight(){
        //Build com.company.hand 1
        ArrayList<Card> hand1ArrayList = new ArrayList<Card>();
        hand1ArrayList.add(new Card(CardValueEnum.SIX, SuitEnum.DIAMONDS));
        hand1ArrayList.add(new Card(CardValueEnum.SEVEN, SuitEnum.HEARTS));
        hand1ArrayList.add(new Card(CardValueEnum.EIGHT, SuitEnum.CLUBS));
        hand1ArrayList.add(new Card(CardValueEnum.NINE, SuitEnum.DIAMONDS));
        hand1ArrayList.add(new Card(CardValueEnum.TEN, SuitEnum.DIAMONDS));
        Hand hand1 = new Hand(hand1ArrayList, "Hand 1");

        //Build com.company.hand 2
        ArrayList<Card> hand2ArrayList = new ArrayList<Card>();
        hand2ArrayList.add(new Card(CardValueEnum.TWO, SuitEnum.HEARTS));
        hand2ArrayList.add(new Card(CardValueEnum.THREE, SuitEnum.CLUBS));
        hand2ArrayList.add(new Card(CardValueEnum.FOUR, SuitEnum.SPADES));
        hand2ArrayList.add(new Card(CardValueEnum.KING, SuitEnum.HEARTS));
        hand2ArrayList.add(new Card(CardValueEnum.QUEEN, SuitEnum.DIAMONDS));
        Hand hand2 = new Hand(hand2ArrayList, "Hand 2");

        //Instantiate straight object
        Straight straight = new Straight(hand1, hand2);
        //Find winner
        Hand winner = straight.evaluate();
        //See if winner == expected winner
        assertEquals(winner, hand1);
    }

    /**
     * Test for a non-Straight com.company.hand.
     * Hand 1: Five cards of different suit
     * Hand 2: Five cards of different suit
     * Expected result: neither com.company.hand wins
     */
    @Test
    public void nonStraight(){
        //Build com.company.hand 1
        ArrayList<Card> hand1ArrayList = new ArrayList<Card>();
        hand1ArrayList.add(new Card(CardValueEnum.TWO, SuitEnum.DIAMONDS));
        hand1ArrayList.add(new Card(CardValueEnum.THREE, SuitEnum.SPADES));
        hand1ArrayList.add(new Card(CardValueEnum.FOUR, SuitEnum.DIAMONDS));
        hand1ArrayList.add(new Card(CardValueEnum.KING, SuitEnum.CLUBS));
        hand1ArrayList.add(new Card(CardValueEnum.JACK, SuitEnum.DIAMONDS));
        Hand hand1 = new Hand(hand1ArrayList, "Hand 1");

        //Build com.company.hand 2
        ArrayList<Card> hand2ArrayList = new ArrayList<Card>();
        hand2ArrayList.add(new Card(CardValueEnum.TWO, SuitEnum.HEARTS));
        hand2ArrayList.add(new Card(CardValueEnum.THREE, SuitEnum.CLUBS));
        hand2ArrayList.add(new Card(CardValueEnum.FOUR, SuitEnum.SPADES));
        hand2ArrayList.add(new Card(CardValueEnum.KING, SuitEnum.HEARTS));
        hand2ArrayList.add(new Card(CardValueEnum.QUEEN, SuitEnum.DIAMONDS));
        Hand hand2 = new Hand(hand2ArrayList, "Hand 2");

        //Instantiate straight object
        Straight straight = new Straight(hand1, hand2);
        //Find winner
        Hand winner = straight.evaluate();
        //See if winner == expected winner
        assertEquals(winner, null);
    }

    /**
     * Both are Straights, one com.company.hand has a higher ranking.
     * Hand 1: Five cards of the same ranking.
     * Hand 2: Five cards of the same ranking, but they rank higher than com.company.hand 1's.
     * Expected result: neither wins, tie.
     */
    @Test
    public void bothStraight(){
        //Build com.company.hand 1
        ArrayList<Card> hand1ArrayList = new ArrayList<Card>();
        hand1ArrayList.add(new Card(CardValueEnum.TWO, SuitEnum.DIAMONDS));
        hand1ArrayList.add(new Card(CardValueEnum.THREE, SuitEnum.HEARTS));
        hand1ArrayList.add(new Card(CardValueEnum.FOUR, SuitEnum.CLUBS));
        hand1ArrayList.add(new Card(CardValueEnum.FIVE, SuitEnum.DIAMONDS));
        hand1ArrayList.add(new Card(CardValueEnum.SIX, SuitEnum.DIAMONDS));
        Hand hand1 = new Hand(hand1ArrayList, "Hand 1");

        //Build com.company.hand 2
        ArrayList<Card> hand2ArrayList = new ArrayList<Card>();
        hand2ArrayList.add(new Card(CardValueEnum.THREE, SuitEnum.HEARTS));
        hand2ArrayList.add(new Card(CardValueEnum.FOUR, SuitEnum.CLUBS));
        hand2ArrayList.add(new Card(CardValueEnum.FIVE, SuitEnum.DIAMONDS));
        hand2ArrayList.add(new Card(CardValueEnum.SIX, SuitEnum.SPADES));
        hand2ArrayList.add(new Card(CardValueEnum.SEVEN, SuitEnum.HEARTS));
        Hand hand2 = new Hand(hand2ArrayList, "Hand 2");

        //Instantiate straight object
        Straight straight = new Straight(hand1, hand2);
        //Find winner
        Hand winner = straight.evaluate();
        //See if winner == expected winner
        assertEquals(winner, hand2);
    }
}