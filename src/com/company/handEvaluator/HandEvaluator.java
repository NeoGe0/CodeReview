package com.company.handEvaluator;

import java.util.ArrayList;
import java.util.List;
import com.company.hand.Hand;
import com.company.handEvaluator.HandValues.Evaluator;
import com.company.handEvaluator.HandValues.Flush;
import com.company.handEvaluator.HandValues.FourOfAKind;
import com.company.handEvaluator.HandValues.FullHouse;
import com.company.handEvaluator.HandValues.HighCard;
import com.company.handEvaluator.HandValues.Pair;
import com.company.handEvaluator.HandValues.Straight;
import com.company.handEvaluator.HandValues.StraightFlush;
import com.company.handEvaluator.HandValues.ThreeOfAKind;
import com.company.handEvaluator.HandValues.TwoPairs;

/**
 * HandEvaluator is called on both hands.
 * HandEvaluator tests in order of poker rules
 */
public class HandEvaluator {

    public HandEvaluator(){ }

    public Hand evaluate(Hand hand1, Hand hand2){

        Hand winner = null;
        //TODO How can I do this better!?
        List<Evaluator> values = getCases(hand1,hand2);

        for (Evaluator evaluator : values){
            if(evaluator.evaluate() != null)
                winner = evaluator.evaluate();
        }
        return winner;
    }

    private List<Evaluator> getCases(Hand hand1, Hand hand2) {

        List<Evaluator> array = new ArrayList<>();
        array.add(new StraightFlush(hand1, hand2));
        array.add(new FourOfAKind(hand1,hand2));
        array.add(new FullHouse(hand1,hand2));
        array.add(new Flush(hand1,hand2));
        array.add(new Straight(hand1,hand2));
        array.add(new ThreeOfAKind(hand1,hand2));
        array.add(new TwoPairs(hand1,hand2));
        array.add(new Pair(hand1,hand2));
        array.add(new HighCard(hand1,hand2));
        return array;
    }
}
