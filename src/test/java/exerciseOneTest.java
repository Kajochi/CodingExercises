import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exerciseOneTest {

    @Test

    void yield9calculatePowerOfInt3(){
        int num = 3;

        double acutal = 9;

        double expected = exerciseOne.calculatePowerOfInt(num);

        assertEquals(expected, acutal);

    }

}