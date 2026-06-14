import java.util.*;

public class Solid_rect_pattern{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length per unit  ");

        int l = sc.nextInt();

        System.out.print("Enter breadth per unit:  ");

        int b = sc.nextInt();

        for(int i = 1; i<=l; i=i+1){

            for(int j = 1; j<=b; j=j+1){

                System.out.print("*");

            }

            System.out.println("");


        }



     
    }

}