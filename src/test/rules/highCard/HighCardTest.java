package test.rules.highCard;

import com.company.card.Card;
import com.company.card.CardValueEnum;
import com.company.card.SuitEnum;
import com.company.hand.Hand;
import com.company.handEvaluator.HandValues.HighCard;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * High Card -
 * Hands which do not fit any higher category are ranked by the value of their highest com.company.card.
 * 	 * If the highest cards have the same value, the hands are ranked by the next highest, and so on.
 */
public class HighCardTest {
    /**
     * Test for a high com.company.card com.company.hand.
     * Hand 1: Five cards of different rankings,
     *          with the highest ranking higher than com.company.hand 2's highest ranking.
     * Hand 2: Five cards of different rankings
     * Expected result: Hand 1 wins
     */
    @Test
    public void highCard(){
        //Build com.company.hand 1
        ArrayList<Card> hand1ArrayList = new ArrayList<Card>();
        hand1ArrayList.add(new Card(CardValueEnum.KING, SuitEnum.DIAMONDS));
        hand1ArrayList.add(new Card(CardValueEnum.FIVE, SuitEnum.HEARTS));
        hand1ArrayList.add(new Card(CardValueEnum.FOUR, SuitEnum.CLUBS));
        hand1ArrayList.add(new Card(CardValueEnum.THREE, SuitEnum.DIAMONDS));
        hand1ArrayList.add(new Card(CardValueEnum.TWO, SuitEnum.DIAMONDS));
        Hand hand1 = new Hand(hand1ArrayList, "Hand 1");

        //Build com.company.hand 2
        ArrayList<Card> hand2ArrayList = new ArrayList<Card>();
        hand2ArrayList.add(new Card(CardValueEnum.SIX, SuitEnum.HEARTS));
        hand2ArrayList.add(new Card(CardValueEnum.EIGHT, SuitEnum.CLUBS));
        hand2ArrayList.add(new Card(CardValueEnum.NINE, SuitEnum.SPADES));
        hand2ArrayList.add(new Card(CardValueEnum.TWO, SuitEnum.HEARTS));
        hand2ArrayList.add(new Card(CardValueEnum.THREE, SuitEnum.DIAMONDS));
        Hand hand2 = new Hand(hand2ArrayList, "Hand 2");

        //Instantiate flush object
        HighCard highCard = new HighCard(hand1, hand2);
        //Find winner
        Hand winner = highCard.evaluate();
        //See if winner == expected winner
        assertEquals(winner, hand1);
    }

    /**
     * Test for a non-HighCard com.company.hand.
     * High com.company.card is the last possible option.
     * Any com.company.hand can be evaluated according to high com.company.card's rules.
     * There is no test for a non high com.company.card com.company.hand.
     */
    @Test
    public void nonHighCard(){
        //N/A
    }

}