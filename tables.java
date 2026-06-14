import java.util.*;


public class tables{

    public static void main(String[] args){

        System.out.println("Enter number to print its table:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 0;

        while(i<=10){

            int prod = n*i;
            
            System.out.print(n); System.out.print(" x "); System.out.print(i); System.out.print(" = "); System.out.println(prod);

            i = i+1;

        }



    }


}