
/**
 * Write a description of class BinaryExercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinaryExercise
{
    public static int[] toBinaryArray(int n){       
        int binary[] = new int[n==0 ? 1:2];
        int counter = 0;
        
        while(n>0){
            binary[counter++]=n%2;
            n=n/2;
            //counter --;
        }
        
        return binary;        
        /*
        int binary[] = new int[40];
        int index = 0;

        while(n > 0){
            binary[index++] = n%2;
            n = n/2;
        }
        return binary;*/
        //return new int[]{0};
    }
}
