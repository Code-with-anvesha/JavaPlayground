import java.util.*;
class Sum
{
       static int sum(final int x,final int y)
       {
           return x+y;
       }
       public static void main(final String args[])
       {
           System.out.print("Enter two numbers: ");

           int num1,num2,x;
              final Scanner obj = new Scanner (System.in);
              num1=obj.nextInt();
              num2=obj.nextInt();
            x=  sum(num1,num2);
              System.out.println("Sum= "+x);

       }
}