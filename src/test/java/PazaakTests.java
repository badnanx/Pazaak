import com.team3.cs210finalprojectteam3.Card;
import com.team3.cs210finalprojectteam3.GameLogic;
import com.team3.cs210finalprojectteam3.Hand;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PazaakTests {

    /**
     * Tests if checkForBust(int) method correctly returns true if player score is over 20.
     * @author Adnan Al Joubi
     */
    @Test
    void bustedOver20(){

        boolean result = GameLogic.getInstance().checkForBust(21);
        System.out.println("DEBUG: checkForBust result: " + result);
        assertTrue(result);

    }

    /**
     * Tests if checkForBust(int) method correctly returns false if player score is at 20.
     * @author Adnan Al Joubi
     */
    @Test
    void noBustAt20(){
        boolean result = GameLogic.getInstance().checkForBust(20);
        System.out.println("DEBUG: checkForBust result: " + result);
        assertFalse(result);
    }

    /**
     * Tests if checkForBust(int) method correctly returns false if player score is under 20.
     * @author Adnan Al Joubi
     */
    @Test
    void noBustUnder20(){
        boolean result = GameLogic.getInstance().checkForBust(19);
        System.out.println("DEBUG: checkForBust result: " + result);
        assertFalse(result);
    }

    /**
     * Tests if checkForBust(int) method correctly returns false if player score is negative.
     * @author Adnan Al Joubi
     */
    @Test
    void noBustNegativeScore(){
        boolean result = GameLogic.getInstance().checkForBust(-4);
        System.out.println("DEBUG: checkForBust result: " + result);
        assertFalse(result);
    }

    /**
     * This test checks to make sure that the Hand constructor randomizes a new list of cards for the hand
     * every time it is called.
     *
     * @author Kory Stennett
     */
    @Test
    void noSameHand(){
        Hand hand = new Hand();
        List<Card> handOneList = hand.hand;
        hand = new Hand();
        List<Card> handTwoList = hand.hand;
        boolean result = handOneList.equals(handTwoList);
        System.out.println("DEBUG: Two Lists of cards created from the same hand randomized twice are equal: "+result);
        assertFalse(handOneList.equals(handTwoList));
    }

    /**
     * This test is to essentially prove that noSameHand() is properly testing equality of hand lists.
     *
     * It should pass because both lists are made from the same hand. The important part is that
     * equals() works for checking equality of lists.
     * @author Kory Stennett
     */
    @Test
    void sameHand(){
        Hand hand = new Hand();
        List<Card> handOneList = hand.hand;
        List<Card> handTwoList = hand.hand;
        boolean result = handOneList.equals(handTwoList);
        System.out.println("DEBUG: Two Lists of cards created from the same hand are equal: "+result);
        assertTrue(handOneList.equals(handTwoList));
    }
}

