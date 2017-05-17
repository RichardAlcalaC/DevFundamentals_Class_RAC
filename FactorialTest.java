

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FactorialTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FactorialTest
{
    @Test
    public void factorialOfZeroIsOne(){
        int expected = 1;
        int calculated = Functions.factorial(0);
        assertEquals(expected,calculated);
    }
    
    @Test
    public void factorialOneIsOne(){
        int expected = 1;
        int calculated = Functions.factorial(1);
        assertEquals(expected,calculated);
    }
    
    @Test
    public void factorialGreatherThanZero(){
        int expected = 1;
        int n = 12;
        for(int i=1; i <= n; i++){
           expected = expected * i;
        }
        int calculated = Functions.factorial(n);
        assertEquals(expected,calculated);
    }
    
}