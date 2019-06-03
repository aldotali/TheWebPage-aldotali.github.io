
import java.util.Random;
import java.util.Scanner;
/**
 * Program name: Lab10b
 * Description: Creates a class with an array of random BigNum
 * @author Aldo Tali 21500097
 * version 1.00, 2015/12/17
 * */
public class lab10b {
   public static void main (String[] args){
      //constants
      final int SIZE = 10;
      
      //variables
      BigNum[] nums;
      String s;
      Random ran;
      int p;
      int n;
      BigNum temp;
      
      //THE CODE
      nums = new BigNum[SIZE];
      s="";
      ran = new Random();
      //generate an array with random binary numbers
      for (int i = 0; i < nums.length; i++) {
         for (int x = 0; x < BigNum.SIZE ; x++) {
            s = s + ran.nextInt(BigNum.BASE);
         }
         nums[i] = new BigNum(s);
         s = "";
      }
       for (int i = 0; i < SIZE; i++){
            System.out.println(i + "- : " + nums[i]);
         }
      
      //the user interaction code part
      Scanner scan = new Scanner (System.in);
      n = SIZE;
      while( n > 0){
         System.out.println( "The size is " + (SIZE - 1) );
         System.out.println(" Please enter an integer");
         n = scan.nextInt();
         p = 0;
         if (n>0 && n<SIZE)
         {     
           //find the biggest number
         
         for ( int i = 0; i < n; i++) {
            if (nums[p].isLessThan(nums[i])) {
               p = i;
            }
         }  
         System.out.println( " The biggest number is :" + nums[p] + " at " + p);
         temp = nums[p];
         System.out.println (" Your input is :" + nums[n]);
         nums[p] = nums[n - 1];
         nums[n - 1] = temp;
         for (int i = 0; i < SIZE; i++){
            System.out.println(i + "- : " + nums[i]);
         }
         }
         else if (n < 0)
         {
           n = -1;
         }
         else
         {
           System.out.println("Please anter an integer within range");
           
         }

         
      }
      
      
      
      
      
   }
}