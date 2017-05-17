

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class binaryOfZeroIsZero.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BinaryExerciseTest
{
    @Test
    public void binaryOfZeroIsZero(){
        int[] binaryArray = BinaryExercise.toBinaryArray(0);
        assertArrayEquals(new int[]{0}, binaryArray);
    }
    
    @Test
    public void binaryOf2Is1_0(){
        int[] binaryArray = BinaryExercise.toBinaryArray(2);
        assertArrayEquals(new int[]{1,0}, binaryArray);
    }
    
    @Test
    public void binaryOf29Is_1_0_0_0_0_0_0_1(){
        int[] expected = {1,0,0,0,0,0,0,1};
        int[] binaryArray = BinaryExercise.toBinaryArray(29);
        assertArrayEquals(expected, binaryArray);
    }
    
    //Calc Size
    @Test
    public void CalculateSizeOfArrayEqualsToZero()
    {
        //assertIsEquals();
    }
    
    //
    @Test
    public void swapExtremesOfAnArrayWithOnlyTwoElements()
    {
        int [] expected = new int []{1,1};
        int [] array = new int[]{1,1};
        BinaryExercise.swapExtremeBits(array);
        assertArrayEquals(expected, array);
    }
    
    
    //ByRAC update and delete later
    @Test
    public void CeroInDecimalIsCeroInBinary_ManualTest()
    {
        //assertArrayEquals(new int[]{0}, NumerationSystemMain.convertToBinaryManual(0));
    }
    
    @Test
    public void OneInDecimalIs1InBinary()
    {
        //assertArrayEquals(new int[]{1}, NumerationSystemMain.convertToBinary(1));
    }
    
    
}