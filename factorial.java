import java.util.*;

public class factorial{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find factorial:");

        int n = sc.nextInt();

        int prod = 1;

        int i=1;

        while(i<=n){

            prod = prod*i;
            i=i+1;

        }
        

        System.out.println(prod);






    }

}