import java.util.*;

public class Hollow_rect_pattern{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length per unit: ");
        int l = sc.nextInt();

        System.out.println("Enter breadth per unit:  ");
        int b = sc.nextInt();
        

        // int i = 1;
        // while(i<=b){

        //     System.out.print("*");
        //     i=i+1;

        // }

        // System.out.println();

        // for(int j = 1; j<=(l-2); j++){

        //     System.out.print("*");
        //     for(int k = 1; k<=(b-2); k++){

        //         System.out.print(" ");

        //     }
        //     System.out.println("*");


        // }
        // int m = 1;
        // while(m<=b){

        //     System.out.print("*");
        //     m=m+1;

        // }



        for(int i = 1; i<=l; i=i+1){

            if(i==1){

                for(int j = 1; j<=b; j++){

                    System.out.print("*");

                }

                System.out.println();

            }
            

            else if(i==l){

                for(int j = 1; j<=b; j++){

                    System.out.print("*");

                }

            }

            else{

                System.out.print("*");

                for(int k = 1; k<=(b-2); k++){
                    System.out.print(" ");
                }

                System.out.println("*");

            }

        }



    }

}