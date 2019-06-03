///*
// * Progam name : Lab06d
// * Description : returns the ascending numbers with a given number of digits
// * @author : Aldo Tali 21500097
// * Version: 1.0;
// * 
// * */
//import java.util.*;
//
//public class Lab06d2
//{
//    //properties
//    int generator = 0;
//    int[] numbers;
//    String s = "";
//    
//    //checks the  digits of the number
//    public boolean checkDigit2( int num, int n)
//    {
//        if ( n <= 1)
//            return true;
//        else if ( n <=2 )
//            return ( num/10 < num%10);
//        else if ((int)(num/(Math.pow(10,n-1))) < ((int)(num/Math.pow(10,n-2)))%10)
//            return checkDigit2((int)(num%(Math.pow(10,n-1))), n-1);
//        else return false;
//    }
//    
//    public void evenNo( int n)
//    {
//        // pass to the number of digits needed
//        if ( generator < Math.pow(10,n-1))
//        { 
//            generator = (int)(Math.pow(10,n-1));
//        }
//        
//        
//        generator += 2;
//        numbers = new int[(int) (Math.pow(10,n))/2 ];
//        
//        for(int i = 0; i < numbers.length; i++)
//        {
//            numbers[i] = generator;
//            generator += 2;
//        }
//        checkDigit( numbers , 0 , n );
//
//        
//    }  
//    public void checkDigit( int[] num, int start, int n )
//    {
//        if ( start +1 >= (int) (Math.pow(10,n))/2)
//            System.out.println();
//        else if ( checkDigit2( num[start], n) )
//        {
//            System.out.print(  num[start] + " ");
//            checkDigit( num, start+1,  n );
//        }
//            
//        else
//            checkDigit( num, start+1,  n );
//    }
//}