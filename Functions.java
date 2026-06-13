import java.util.*;

public class Functions{

    //Printing name function
    public static void printMyName(String name){

        System.out.println(name);
        return;

    }

    //adding two number functions
    public static int addTwoNos(int a,int b){

        return a+b;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        printMyName(name);

        int sum = addTwoNos(5, 6);
        System.out.println(sum);



    }

}