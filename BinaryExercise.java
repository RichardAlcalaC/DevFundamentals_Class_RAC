import java.util.Arrays;
/**
 * Write a description of class BinaryExercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryExercise
{
    
    //ByClass
    public static int[] toBinaryArray(int n){       
        int length = getSizeOfBinaryArray(n);
        int [] binary = new int[length];
        
        for(int index = length -1; index >= 0; index--){
            binary[index] = n%2;
            n = n/2;
        }
        return binary;
    }
    
    
    //ByClass
    //public static int [] calculateBinaryArraySize(int n){
      //  int length=1;
      //  return length;
    //}
    
    //ByClass
    public static void swapExtremeBits(int [] array){
        
        /*
        int initValue = array[0];
        int finalValue = array[array.length -1];
        
        array[0] = finalValue;
        array[array.length -1] = initValue;
        
        
        for(int index = array.length -1; index >= 0; index--){
        }
        */
       int aux;
       
       for(int index = 0; index <=array.length/2; index++){
           aux = array[index];
           array[index] = array[array.length - index -1];
           array[array.length - index -1] = aux;
           
       }
    }
    
    // ByRac
    public static int [] convertToBinary(int decimalNumber)
    {
        int binaryMode [] = new int [getSizeOfBinaryArray(decimalNumber)];
        int decNum = decimalNumber;
        for(int i = 0; i < binaryMode.length; i++){
            binaryMode[i] = decNum%2;
            decNum /= 2;
        }
        System.out.println("decimal: " + decimalNumber + "\nbinary in reverse: " + Arrays.toString(binaryMode));
        return binaryMode;
    }
    
    //ByRac and ByClass
    public static int getSizeOfBinaryArray(int decimalNumber)
    {
        int decNum = decimalNumber;
        int SizeOfBinaryArray = 0;
        while(decNum!=0){
            SizeOfBinaryArray++;
            decNum /= 2;
        }
        return SizeOfBinaryArray;
    }
    
    
}
