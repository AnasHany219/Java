package user_input;

import java.util.Scanner;
/*
nextBoolean()
nextByte()
nextShort()
nextInt()
nextLong()
nextFloat()
nextDouble()
next()
nextLine()
*/
public class User_Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
    // nextInt()
        System.out.print("Enter A Number: ");
        int x = in.nextInt();
        System.out.print("Enter A Number: ");
        int y = in.nextInt();
        System.out.println("Num1 = " + x + " " + "Num2 = " + y);
        
    // printf
        System.out.printf("Num1 = %d Num2 = %d %n", x, y);
    /*
    %d : [bgyte, short, int, long]
    %f : [float, double]
    %C : Characters Capital C will uppercase the letter
    %S : String Capital S will uppercase all the letters in the string
    %n : NewLine
    */
    
    // nextLine()
        System.out.print("Enter The value of c: ");
        String c = in.nextLine();   // abc d e
        System.out.printf("c : %S%n", c);   // ABC D E
        
    // next()
        System.out.print("Enter The value of s: ");
        String s = in.next();       // abc d e
        System.out.printf("S : %S%n", s);   // ABC
      
    }
}
/*
Enter A Number: 21
Enter A Number: 9
Num1 = 21 Num2 = 9
Num1 = 21 Num2 = 9 
Enter The value of c: abc d e
c : ABC D E
Enter The value of s: abc d e
S : ABC
*/
