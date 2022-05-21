import com.team3.cs210finalprojectteam3.GameLogic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PazaakTests {

    /**
     * Tests if checkForBust(int) method correclty returns true if player score is over 20.
     * @author Adnan Al Joubi
     */
    @Test
    void playerBusted(){

        boolean result = GameLogic.getInstance().checkForBust(21);
        System.out.println("DEBUG: checkForBUst result: " + result);
        assertTrue(result);

    }

    /**
     * Tests if checkForBust(int) method correctly returns false if player score is under 20.
     * @author Adnan Al Joubi
     */
    @Test
    void noBust(){
        boolean result = GameLogic.getInstance().checkForBust(20);
        System.out.println("DEBUG: checkForBUst result: " + result);
        assertFalse(result);
    }
}

