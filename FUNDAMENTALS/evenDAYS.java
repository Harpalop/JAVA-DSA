// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

package FUNDAMENTALS;

public class evenDAYS {

    public static void main(String[] args) {


        System.out.println("Kunal can go out on date : ");

        int count = 0;


        for (int i = 1; i<=31; i++){

            if(i%2==0){

                System.out.println(i);

                count++;
            }

        }

        System.out.print("total days : "+count);

    }
    
}
