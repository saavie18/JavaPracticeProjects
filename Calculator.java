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

