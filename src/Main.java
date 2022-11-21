import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        double a, b;
        double c = 0;
        String op;
        while (true) {
            System.out.println("Enter the operation");
            System.out.println("+\n -\n /\n *\n enter 0 to exit");
            op = sc.next();
            if(op.equals("0"))
            {
                break;

            }
            System.out.println("Enter the first number");
            a = sc.nextDouble();
            System.out.println("Enter the second number");
            b = sc.nextDouble();
            switch (op) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;

                case "*":
                    c = a * b;
                    break;
                case "/":
                    try {
                        c = a / b;
                    }catch(Exception e){
                        System.out.println("exception occured"+e.toString());
                    }
                    break;


                default:
                    System.out.println("Invalid input");
            }
            System.out.printf(a + " " + op + " " + b + " = " + c);

        }
    }



}