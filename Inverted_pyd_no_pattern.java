import java.util.*;

public class Inverted_pyd_no_pattern{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows in pyramid:  ");
        int l = sc.nextInt();

        for(int i = l; i>=1; i--){

            for(int j = 1; j<=i; j++){

                System.out.print(j+" ");

            }

            System.out.println();

        }

        

    }

}