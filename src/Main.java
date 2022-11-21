import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        double a,b;
        double c=0;
        String op;
        System.out.println("Enter the first number");
         a=sc.nextDouble();
        System.out.println("Enter the second number");
        b=sc.nextDouble();
        System.out.println("Enter the operation");
        System.out.println("+\n -\n /\n *");
        op=sc.next();
        switch(op)
        {
            case "+": c=a+b;
                break;
            case "-": c=a-b;
                break;


            default:
                System.out.println("Invalid input");
        }
        System.out.printf(a + " " + op + " " + b + " = " + c);


    }

}