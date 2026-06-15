import java.util.*;

public class function_Factorial{

    public static int numFactorial(int n){

        int prod = 1;
        for(int i = n; i>=1; i--)
            prod = prod*i;

        return prod;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to print its factorial:  ");
        int n = sc.nextInt();

        int fact=numFactorial(n);

        System.out.println("Factorial is "+ fact);





    }
    
}
