import com.sun.tools.javac.Main;
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
    @Test
    void isNumberEqualsString_3(){
        //GIVEN
        int inputNum = 3;

        //WHEN
        String actual = exerciseOne.determineWordOfNumber(inputNum);

        //THEN
        String expected = "3";

        assertEquals(expected, actual);

    }

    @Test
    void isPowerOf2Equals4(){
        //GIVEN
        int inputNum = 2;

        //WHEN
        double actual = exerciseOne.calculatePowerOfInt(inputNum);

        //THEN
        double expected = 4;

        assertEquals(expected, actual);

    }

}