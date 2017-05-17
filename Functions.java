
/**
 * Write a description of class Functions here.
 *
 * @author Susana Taquichiri
 * @version 05/11/2017
 */
public class Functions
{
    /**
     * It returns a factoial value of a number
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int factorial(int n)
    {
       int result = 1;
       for(int i=1; i <= n; i++){
           result = result * i;
        }
        return result;
    }
    
    public static boolean capicuo(int n){
        if(n / 10 == 0){
            return true;
        }
        else{
            return n == invertDigits(n);
        }
    }
    
    public static int invertDigits(int n){
            int inverted = 0;                   
            while(n != 0){
                inverted = (inverted *10) + n % 10;
                n=n/10;
           }          
           return inverted;
    }
}
