package selection_statement;

import java.util.Scanner;

public class Selection_Statement {
    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);
        
        num = in.nextInt();               // 10
        if(num % 2 == 0)
            System.out.println("Even.");  // Even.
        else
            System.out.println("Odd.");
    }
    /*
    Relational Operations
    ==  equal to
    !=  not equal to
    >   greater than
    >=  greater than or equal
    <   less than
    <=  less than or equal
    */
}
