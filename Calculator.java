import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int total = 0;
        char operator;
        int leftnum;
        int rightnum;
        int result = 0;
        System.out.println("Enter the expression for normal calculator");
        String input = sc.next();
        char[] inputArray = input.toCharArray();
        
        
        /* try traversing the whole uinput array and form the expression 
        Example : input : 1+2 . input : 1+2-1 . input : 1+2+6
        
        ##Logic 
        Step 1 : travese the input from 0th index to last index of input string 
        Step 2 : on every traversal compare if  inputArray[i] >= 0 || inputArray[i] <=9 then its a number and assign it to leftnum
        Step 3 : on every traversal compare if  inputArray[i].equals to  + - * / then its a operator and assign it to operator
        Step 4 : on every traversal compare if  iinputArray[i] >= 0 || inputArray[i] <=9 then its a number and assign it to rightnum
        Step 5 : once you have these three parameter invoke execute method and assign its result to leftnum and follow the Steps 4 again 
        Keep performing the while loop until iterator reaches to last index of input String 

        */
        
        for (int i = 1; i < inputArray.length; i+=2) {
            //System.out.print(inputArray[i]);
            //operator = inputArray[i];
            if(i==1) {
                leftnum = Character.getNumericValue(inputArray[i - 1]);
            }
            else
            {
                leftnum = result;
            }
            operator = inputArray[i];
            rightnum = Character.getNumericValue(inputArray[i+1]);
             result = execute(leftnum, operator, rightnum);
        }
        System.out.println("Total = " +result);
    }
   public static int execute (int leftnum , char operator , int rightnum)
   {
       int total;
       switch (operator)
       {
               case '+' :
                   total = leftnum + rightnum ;
                   break;
               case '-' :
                   total = leftnum - rightnum ;
                   break;
               case '*' :
                   total = leftnum * rightnum ;
                   break;
               case  '/' :
                   total = leftnum != 0 ? leftnum / rightnum : 0 ;
                   break;
                   default:
                   System.out.println("Does not match any opcode");
                   total = 0;

           }
           return total;
       }

   }

