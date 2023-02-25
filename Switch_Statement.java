package switch_statement;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1, n2;
        System.out.print("Enter the first number: ");
        n1 = in.nextInt();  // 20
        System.out.print("Enter the second number: ");
        n2 = in.nextInt();  // 10
        
        System.out.print("Enter ont of these operators + - * / % : ");
        char c = in.next().charAt(0);
        
        switch(c){
            case '+' -> System.out.println(n1 + " + " + n2 + " = " + (n1+n2));  // 30
            case '-' -> System.out.println(n1 + " - " + n2 + " = " + (n1-n2));  // 10
            case '*' -> System.out.println(n1 + " * " + n2 + " = " + (n1*n2));  // 200
            case '/' -> System.out.println(n1 + " / " + n2 + " = " + (n1/n2));  // 2
            case '%' -> System.out.println(n1 + " % " + n2 + " = " + (n1%n2));  // 0
            default -> System.out.println("It is not an option.");
        }
        // You can write Switch Statement as same as c++ code.
    }
}
