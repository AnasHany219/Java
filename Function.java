package function;

import java.util.Scanner;

public class Function {
    public static void max (int n1, int n2, int n3){
        if(n1 > n2){
            if(n1 > n3){
                System.out.println("MAX Number is: " + n1);
            }
            else if(n3 > n2){
                System.out.println("MAX Number is: " + n3);
            }
        }
        else if(n2 > n3){
            System.out.println("MAX Number is: " + n2);
        }
        else{
            System.out.println("MAX Number is: " + n3);
        }
    }
    public static void min (int n1, int n2, int n3){
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter a Three number: ");
        num1 = in.nextInt(); 
        num2 = in.nextInt(); 
        num3 = in.nextInt();
        
        max(num1, num2, num3);
        
        //The Math.max() function is an inbuilt function in Java which returns maximum of two numbers.
        System.out.println("MAX Number is: " + Math.max(Math.max(num1, num2), num3));
    }
}
/*
Enter a Three number: 13 10 12
MAX Number is: 13
MAX Number is: 13
*/
