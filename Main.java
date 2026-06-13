import java.util.*;

public class Main {

    public static void main(String[] args){
        //output

        System.out.print("Hello World\n");

        System.out.println("to print in second line with println");
        System.out.println(" this is printed in next line by println");

        System.out.println("To print in next line with backslash n \n this line is printed in next line by backslash n\n");


        //variables(you need to define variable data type in java)

        int a=7;
        int b=8;
        String quote="Ashish will be IITian";

        int sum = a+b;
        int mul = a*b;
        int diff = b-a;

        System.out.println(sum);
        System.out.println(mul);
        System.out.println(diff);
        System.out.println("Here first integer variables are located,\nthen specific operations are performed on their values and then the result is stored in variables called sum, mul, diff\n");


        //input (first import java.util.*)

        Scanner sc = new Scanner(System.in);

        System.out.println("enter anything and it will be printed:-\n");

        String name = sc.nextLine(); // here the input is stored in name which is a variable of string type

        System.out.println(name); // lets print what we input for checking

        // lets calc area of square

        System.out.println("Enter length then breadth to print its area:-\n");

        int length = sc.nextInt(); // scanner class is already defined so no need to redefine it
        int breadth = sc.nextInt();

        int area = length*breadth;

        System.out.println(area);

        // Conditional statements 

        System.out.println("Enter age to print adult or not:-\n");

        int age = sc.nextInt(); // scanner class already defined so direct use 

        if(age>18){

            System.out.println("You are an Adult");

        }

        else{

            System.out.println("You are not an adult");

        }

        // check even odd

        System.out.println("Enter a number to check whether its even or odd:-\n");

        int number = sc.nextInt();

        if(number%2==0){

            System.out.println("This is an Even Number\n");

        }

        else{

            System.out.println("This is an odd number\n");

        }

        // comparing two numbers

        System.out.println("Enter two numbers to compare them");

        System.out.println("Enter number a:-");

        int a1 = sc.nextInt();

        System.out.println("Enter number b:-");

        int b1 = sc.nextInt();

        if(a1==b1){

            System.out.println("a and b are Equal\n");
        }

        else if(a1>b1){

            System.out.println("a is greater than b");

        }

        else{

            System.out.println("a is Smaller than b");

        }

        // Using switch

        System.out.println("Enter a button 1,2,3 to print output");

        int button = sc.nextInt();

        switch(button){

            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Namaste");
            break;

            case 3: System.out.println("Bonjour");
            break;

            default: System.out.println("Invalid Button entered");
        }





    }
}