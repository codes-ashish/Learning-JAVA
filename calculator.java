import java.util.*;


public class calculator{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int opt = 0;

        do{

           //taking user input

            System.out.println("Welcome to calculator");

            System.out.println("You could perform following Operations\n 1. Addition \n 2. Subtraction \n 3. multiplication \n 4. Division\n 5. Comparison\n");

        

            System.out.println("Enter a:  ");
            int a = sc.nextInt();

            System.out.println("Enter b:  ");
            int b = sc.nextInt();

            System.out.println("Enter operation number to perform:  ");
            int choice = sc.nextInt();

            //performing operations

            switch(choice){

                case 1: int sum = a+b;
                System.out.print("sum of a and b is ");
                System.out.println(sum);
                break;

                case 2: int diff = a-b;
                System.out.print("Difference of a and b is ");
                System.out.println(diff);
                break;

                case 3: int prod = a*b;
                System.out.print("Product of a and b is ");
                System.out.println(prod);
                break;

                case 4: int div = a/b;
                System.out.print("a divided by b is ");
                System.out.println(div);
                break;

                case 5: if (a>b){

                    System.out.println("a is greater than b");

                }

                else if (a==b){
                    System.out.println("a is equal to be");
                }

                else{
                    System.out.println("a is smaller than b");
                }


            }

            System.out.println("Enter 1 to reuse and zero to exit");

            opt = sc.nextInt();
            
        } while(opt==1);    









    }


}