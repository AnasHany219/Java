package nested_loop;

public class Nested_Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Outer loop " + i + " : ");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nested loop " + j + ", ");
            }
            System.out.println(" ");
        }
    }
}
/*
Outer loop 0 : Nested loop 0, Nested loop 1, Nested loop 2, Nested loop 3,  
Outer loop 1 : Nested loop 0, Nested loop 1, Nested loop 2, Nested loop 3,  
Outer loop 2 : Nested loop 0, Nested loop 1, Nested loop 2, Nested loop 3,
*/
