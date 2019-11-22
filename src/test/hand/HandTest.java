package test.hand;

import com.company.card.Card;
import com.company.deck.Deck;
import com.company.hand.Hand;
import org.junit.Test;

import java.util.ArrayList;

import static javax.swing.UIManager.get;
import static org.junit.Assert.*;

public class HandTest {

    //ensure that the com.company.hand has the name we give it
    @Test
    public void getHandName() {
        Deck d = new Deck();
        Hand h = new Hand(d, "White Hand");
        String expectedName = "White Hand";
        String actualName = h.getHandName();
        assertEquals(expectedName, actualName);

    }

    //ensure the com.company.hand is 5 cards long
    @Test
    public void handLength() {
        Deck d = new Deck();
        Hand h = new Hand(d, "White Hand");
        int expectedLength = 5;
        int actualLength = h.getHand().size();
        assertEquals(expectedLength, actualLength);
    }

    //ensure that the com.company.hand is made of cards
    @Test
    public void handIsCards() {
        Deck d = new Deck();
        Hand h = new Hand(d, "White Hand");
        ArrayList<Card> hand = h.getHand();
        boolean notCard = false;
        for(int i=0; i<5; i++){
            if(hand.get(i).getClass() != com.company.card.Card.class){
                notCard = true;
            }
        }
        assertEquals(notCard, false);
    }

}