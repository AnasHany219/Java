package recursion;

import java.util.Scanner;

// Recurion in java is a process in which a method calls itself continuously.
// A method in java that class itself is calles recursive method.

public class Recursion {
    public static long factorial(long n){    
        if (n == 0)    
            return 1;    
        else    
            return(n * factorial(n-1));    
    }   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inter a number: ");
        long n = in.nextInt();      // 5
        System.out.println("Factorial " + n + " = " + factorial(n));  // 120
    }
}
/*
Inter a number: 5
Factorial 5 = 120
*/
