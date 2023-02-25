package arithmetic_operators;

public class Arithmetic_Operators {
    public static void main(String[] args) {
        int x = 5 *(2 *(2 + 1));
        System.out.println("X = " + x); // 30
        
        // Type Casting
        int i = 9, j = 2;
        System.out.println("I / J = " + (float)i/j);    // 4.5
        
        int y = 0;
        y = x++;    // postfix
        System.out.println("Y = " + y); // 30
        y = ++x;    // prefix
        System.out.println("Y = " + y); // 32
        
        // The Assignment Operators
        // =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
        int a = 5;
        a += 5;
        System.out.println("A = " + a); // 10
    }
}
