/**
 * Program name: Lab10
 * Description: Creates instance methods incorporating arrays
 * @author Aldo Tali 21500097
 * version 1.00, 2015/12/17
 * */


public class BigNum {
   
   //PROPERTIES
   public static int SIZE = 8;        
   public static int BASE = 10;       
   int[] nums;
   
   //CONSTRUCTORS
   //constructor without parameter
   public BigNum() {
      nums = new int[SIZE];
      for(int i = 0; i < SIZE; i++) {
         nums[i] = 0;
      }
   }
   
   //constructor with string parameter
   public BigNum(String str) {
      nums = new int[SIZE];
      nums = store(nums, str);
   }
   
   //the copy constructor
   public BigNum( BigNum other) {
      this.SIZE = other.SIZE;
      this.nums = other.nums;
   }
   
   //METHODS
   
   // method to store the numbers
   public int[] store(int[] array, String s) {
      //variables
      int b;
      
      //the code
      b = s.length() - 1;
      for ( int i = b; i > -1 ;i--) {
         array [b - i] = Integer.valueOf(s.substring(i,i+1));
    
      }
       return array;
   }
  
   //it outputs the string version of the array
   public String toString() {
      //variables
      String str;
      
      //the code
      str = "[";
      for (int i = SIZE-1; i >= 0; i--) {
         str = str + nums[i]  ;
      }
      str = str + "]";
      return str;
   }
   
   //the .equals method which compares two object
   public boolean equals(BigNum other) {     
      
      //the code
        
      for ( int i = 0; i < SIZE; i++) {
         if ( this.nums[i] != other.nums[i]) {
            return false;
         }
 
      }
      return true;
   }
   
   //checks if the array is empty
   public boolean isZero() {     
      //the code
      for( int i = 0; i < SIZE ; i++) {
         if (nums[i] != 0) {
            return false;
         }
      }
      return true;
   }
   
   //the shift method
   public void shift(boolean left) {
      if (!left) {
         for ( int i = 0; i < SIZE - 1 ;i++) {
            nums[i] = nums[i + 1];
         }
         nums[SIZE - 1] = 0; 
      }
      if (left) {
         for (int i = SIZE - 1 ; i > 0 ;i--) {
            nums [i] = nums [i - 1];
         }
         nums [0] = 0;
      }
   }
   
   //the add method
   public int add(BigNum other){
      //variables
      int outOfBounds;
         
      //the code
      outOfBounds = 0;
      for ( int i = 0; i < SIZE; i++) {
         nums[i] = nums[i] + other.nums[i] + outOfBounds; 
         outOfBounds = nums[i] / BASE;
         nums[i] = nums[i] % BASE; 
      }
      return outOfBounds;
      
   }
   //dtermine wether the number is less than the other
   public boolean isLessThan(BigNum other) {
      
      // the code
      for ( int i = SIZE - 1 ; i >= 0; i--) {
         if ( nums[i] < other.nums[i]) {
            return true;
         }
         if ( nums[i] > other.nums[i]) {
            return false;
         }
      }
      return false;
   }
}