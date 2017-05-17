

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CapicuoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CapicuoTest
{

    //capicua(int) -> boolean
    @Test
    public void onlyNumberWithOneDigitIsCapicua(){
        //assertEquals(true, Functions.capicuo(5));
        assertTrue(Functions.capicuo(5));
    }
    
    @Test
    public void aNumberWithTwoDigitsIsCapicuoIfBothDigitsAreEquals(){
        assertTrue(Functions.capicuo(33));
        assertTrue(Functions.capicuo(66));
    }
    
    @Test
    public void aNumberWithTwoDigitsIsNotCapicuoIfItsDigitsAreNotEquals(){
        assertFalse(Functions.capicuo(10));
        assertFalse(Functions.capicuo(23));
    }
    
    @Test
    public void aNumberIsCapicuoIfItHasTheSameDigitsReadFromLeftToRightOrViceversa(){
        assertTrue(Functions.capicuo(12321));
        assertTrue(Functions.capicuo(40033004));
    }
}
