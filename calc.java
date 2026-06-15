import java.util.*;

public class calc{

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Welcome text

        System.out.println("Welcome to calculator");

        System.out.println("You can perform addition, subtraction, multiplication, division, modulous or comparison on two numbers\n");


        // making a loop for reuse

        int opt = 1;

        do{

            // Taking numbers input

            System.out.println("Enter number a:  ");
            int a = sc.nextInt();

            System.out.println("Enter number b:  ");
            int b = sc.nextInt();

            // Doing operations

            int sum = a+b;
            int diff = a-b;
            int prod = a*b;
            int div = a/b;
            int rem = a%b;

            //option for operations

            System.out.println("Enter option number:\n 1: Addition\n 2: Subtraction\n 3: Multiplication\n 4: Division\n 5: Modulous\n 6: Compare numbers ");

            int choice = sc.nextInt();

            // operation cases using switches

            switch(choice){

                case 1: System.out.print("addition of a and b is: ");
                System.out.println(sum);
                break;
            
                case 2: System.out.print("Difference of a and b is: "); System.out.println(diff);
                break;

                case 3: System.out.print("product of a and b is : "); System.out.println(prod);
                break;

                case 4: System.out.print("a divided by b is: "); System.out.println(div);
                break;

                case 5: System.out.println("Remainder of a divided by b is: "); System.out.println(rem);
                break;

                case 6: if(a==b){
                    System.out.println("a and b are equal");
                }

                else if(a>b){
                    System.out.println("a is Greater than b");
                }

                else{
                    System.out.println("a is Smaller than b");
                }
            
                break;

                default: System.out.println("Enter valid option");
            }

            // asking for reuse for executing loop

            System.out.println("For using calculator, enter 1 to use, enter 0 to exit");


            opt = sc.nextInt();


        } while(opt == 1 );
        
    }
}