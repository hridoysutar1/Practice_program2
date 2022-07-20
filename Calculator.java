package Practice_projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter operation symbol (+,-,*,/");
        String sym=sc.next();
        switch (sym){
            case "+":
                System.out.println("Addition is: "+(a+b));
                break;
            case "-":
                System.out.println("Subtraction is: "+(a-b));
                break;
            case "*":
                System.out.println("Multiplication is: "+(a*b));
                break;
            case "/":
                System.out.println("Division is: "+(a/b));
                break;
            default:
                System.out.println("Wrong Symbol");
                break;
        }
    }
}
