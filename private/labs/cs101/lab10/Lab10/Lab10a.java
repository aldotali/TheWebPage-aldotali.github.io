/**
 * Program name: Lab10a
 * Description: Test BigNum class
 * @author Aldo Tali 21500097
 * version 1.00, 2015/12/17
 * */
public class Lab10a {
   public static void main (String[] args) {
      //variables
      BigNum b1;
      BigNum b2;
      BigNum b3;
      
      
      //the test code
      b1 = new BigNum();
      b2 = new BigNum("110");  
      b3 = new BigNum(b2);
      
      System.out.println("b1 to string: " + b1);
      System.out.println();
      System.out.println("b1 to string: " + b2);
      System.out.println();
      System.out.println("b1 to string: " + b3);
      System.out.println( "Their equality is " + b2.equals(b3) );
      
      b2.add(b3);
      
      System.out.println("After adding b3 with b2: ");
      System.out.println(b2);
      b2.shift(true);
      System.out.println("After shifting left " + b2);
      b2.shift(true);
      System.out.println("After shifting left " + b2);
      b2.shift(false);
      System.out.println("After shifting right " +b2);
      b2.shift(true);
      System.out.println("After shifting left " + b2);
      b2.shift(false);
      System.out.println("After shifting right " +b2);
      
      System.out.println("Their emptiness is " + b2.isZero());
      System.out.println("B1 emptiness is " + b1.isZero());
   }
}