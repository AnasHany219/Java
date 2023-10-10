package overloading;
/*
Overloading allows different methods to have the same name,
    But different signatures where the signature can differ by
    the number of input parameters
        or
    type of input parameters
        or
    both.
*/
/*
Overloading is related to compile-time (or static) polymorphism.
*/
public class OverLoading {
    public static int sum(int n1, int n2){
        return n1 + n2;
    }
    public static double sum(double n1, double n2){
        return n1 + n2;
    }
    public static void main(String[] args) {
        int n1 = 4;
        double n2 = 4.1;
        System.out.println(sum(n1, n1));    // 8
        System.out.println(sum(n2, n2));    // 8.2
    }
}
