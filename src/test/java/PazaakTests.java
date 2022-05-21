import com.team3.cs210finalprojectteam3.GameLogic;
import org.junit.jupiter.api.Test;

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
}

