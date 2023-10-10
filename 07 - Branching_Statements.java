package branching_statements;

public class Branching_Statements {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 3)  continue;
            if(i == 8)  break;
            System.out.print(i + ", ");
        }
    }
}
