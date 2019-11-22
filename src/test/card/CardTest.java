package test.card;

import com.company.card.Card;
import com.company.card.SuitEnum;
import com.company.card.CardValueEnum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CardTest {

    //TODO Give meaningful names to your variables, No "Card c" naming. Code should be self explanatory and sufficient by itself to allow other devs to understand your code.

    @Test
    public void getSuit() {
        Card c = new Card(CardValueEnum.JACK, SuitEnum.CLUBS);

        //expected result
        SuitEnum expected = SuitEnum.CLUBS;

        //card's suit
        SuitEnum actual = c.getSuit();

        assertEquals(expected, actual);
    }

    @Test
    public void setSuit() {
        //create a card and set the suit
        Card d = new Card(CardValueEnum.JACK, SuitEnum.DIAMONDS);

        //expected suit: Diamonds
        SuitEnum expected = SuitEnum.DIAMONDS;

        //actual suit:
        SuitEnum actual = d.getSuit();

        assertEquals(expected, actual);

    }

    @Test
    public void getCardValue() {
        Card c = new Card(CardValueEnum.JACK, SuitEnum.CLUBS);

        //expected result
        CardValueEnum expected = CardValueEnum.JACK;

        //card's suit
        CardValueEnum actual = c.getCardValue();

        assertEquals(expected, actual);
    }

    @Test
    public void setCardValue() {
        Card c = new Card(CardValueEnum.QUEEN, SuitEnum.HEARTS);

        //expected result
        CardValueEnum expected = CardValueEnum.QUEEN;

        //com.company.card's suit
        CardValueEnum actual = c.getCardValue();

        assertEquals(expected, actual);
    }

    @Test
    public void cardName() {
        Card c = new Card(CardValueEnum.QUEEN, SuitEnum.HEARTS);

        String expected = "QUEEN HEARTS";

        String actual = c.cardName();

        assertEquals(expected, actual);

    }
}