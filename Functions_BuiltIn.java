package functions_built.in;

public class Functions_BuiltIn {
    public static void main(String[] args) {
        int a = -3;
        System.out.println("Returns the absolute value: " + Math.abs(a));
        double b = 3.1;
        System.out.println("Returns the smallest value that is greater than or equal to the argument: " + Math.ceil( b));
        double c = 3.9;
        System.out.println("Returns the largest value that is less than or equal to the argument: " + Math.floor(c));

        System.out.println("Returns the greater of two double values: " + Math.max(b, c));
        System.out.println("Returns the smaller of two double values: " + Math.min(b, c));
        
        System.out.println("Returns the value of the first argument raised to the power of the second argument " + Math.pow(4, 2));
        
        System.out.println(Math.PI);
    }
}
/*
Returns the absolute value: 3
Returns the smallest value that is greater than or equal to the argument: 4.0
Returns the largest value that is less than or equal to the argument: 3.0
Returns the greater of two double values: 3.9
Returns the smaller of two double values: 3.1
Returns the value of the first argument raised to the power of the second argument 16.0
3.141592653589793
*/
/*
Built-in Functions: 
https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
*/
