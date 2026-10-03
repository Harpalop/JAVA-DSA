// to find lowest common multiplier // 

package FUNDAMENTALS;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);

        for(int i = max ; ; i++){

            if(i%num1==0 && i%num2==0){

                System.out.println("the LCM is : "+i);

                break;
            }


        }

        sc.close();

    
    }

}
