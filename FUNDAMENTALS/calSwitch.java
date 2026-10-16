package FUNDAMENTALS;

import java.util.Scanner;

public class calSwitch {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the first number : ");
         double a = sc.nextDouble();

         System.out.println("enter the second number : ");
         double b = sc.nextDouble();

         System.out.println("Enter the operation to perform : ");
         System.out.print("% , * , / , + , -");

         System.out.println("Your result is : ");

         char chosen = sc.next().charAt(0);

         switch (chosen) {

            case '%':
                System.out.println(a%b);
                break;


            case '*':
                System.out.println(a*b);
                break;

            case '+':
                System.out.println(a+b);
                break;
                
            case '-':
                System.out.println(a-b);
                break;
                
            case '/':
                System.out.println(a/b);
                break;


                default :
                    System.out.println("enter a valid operator !");

             }

             sc.close();
    }
    
}
