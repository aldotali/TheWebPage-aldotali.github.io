/*
 * @author: Aldo Tali
 * Id: 21500097
 * Program Description: Tester for the SimpleStack
 * 
 * */
import java. util .Scanner;

public class SimpleStackTester
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner (System.in);
        
        //properties
        SimpleStack test;
        String      line;
        String      s;
        int         result;
        int         num1;
        int         num2;
        
        //initialize variables
        test = new SimpleStack();
        line = scan.nextLine();
        result = 0;
        
        try{
        
            //check the characters in the line to determine the calcculating expressions
            for (int i = 0; i < line.length(); i++)
            {
                //seperate digits from operands
                if (Character.isDigit(line.charAt(i)))
                    test.push("" + line.charAt(i));
                
                //check the type of the operand 
                else if (line.charAt(i) == '+')
                {
                    //gets the last two numbers and adds them
                    s = test.pop().charAt(0) +"";
                    num1 = Integer.parseInt(s);
                    s = test.pop().charAt(0) +"";
                    num2 = Integer.parseInt(s);
                    
                    test.push( num1 + num2 + "");
                    System.out.println(test);
                    
                }
                else if (line.charAt(i) == '-')
                {
                    //gets the last two numbers and substracts them
                    s = test.pop().charAt(0) +"";
                    num1 = Integer.parseInt(s);
                    s = test.pop().charAt(0) +"";
                    num2 = Integer.parseInt(s);
                    
                    test.push( num2 - num1 + "");
                    System.out.println(test);
                    
                }
                else if (line.charAt(i) == '/')
                {
                    //gets the last two numbers and divides them
                    s = test.pop().charAt(0) +"";
                    num1 = Integer.parseInt(s);
                    s = test.pop().charAt(0) +"";
                    num2 = Integer.parseInt(s);
                    
                    test.push( num2 / num1 + "");
                    System.out.println(test);
                    
                }
                else if (line.charAt(i) == '*')
                {
                    //gets the last two numbers and multiplies them
                    s = test.pop().charAt(0) +"";
                    num1 = Integer.parseInt(s);
                    s = test.pop().charAt(0) +"";
                    num2 = Integer.parseInt(s);
                    
                    test.push( num1 * num2 + "");
                    System.out.println(test);
                    
                }
                else
                {
                    System.out.println("Sorry you have enterd one or more charachteres incorrectly");
                }
            }
            
            //gives the overall result of the stack
            /*while(!test.isEmpty())
            {
                num1 = Integer.parseInt(test.pop());
                result += num1;
            }*/
            
            result = Integer.parseInt(test.pop());
            if( !test.isEmpty() ) throw new Exception();
            
            
            System.out.println("The result is " + result);
        
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("The Postfix expression is wrong!");
        }
        catch(Exception e){
            System.out.println("The postfix expression is very wrong!");
        }

    }
}