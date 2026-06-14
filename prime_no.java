import java.util.*;

public class prime_no{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check wether it is prime or not");

        int n = sc.nextInt();

        int c = 0;

        for(int i=2; i<n; i=i+1){

            int rem = n%i;

            if(rem==0){

                c=c+1;

            }              


        }

        if(c==0){

            System.out.println("This is a prime number");


        }

        else{

            System.out.println("This is not prime number");

        }

    }

}