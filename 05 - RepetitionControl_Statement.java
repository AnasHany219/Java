package repetitioncontrol_statement;

public class RepetitionControl_Statement {
    public static void main(String[] args) {
        int count = 1;
    
    // While Statement    
        System.out.println("While Statement: ");
        while(count++ <= 5){
            System.out.print("#" + count + ", ");
        }
        System.out.println("Count = " + count);
        System.out.println("--------------");
    
    // Do While Statement
        System.out.println("Do While Statement: ");
        count = 1;
        do{
            System.out.print("#" + count + ", ");
        }while(count++ <= 5);
        System.out.println("Count = " + count);
        System.out.println("--------------");
        
    // For Statement
        System.out.println("For Statement: ");
        for(int i = 0; i < count; i++){
            System.out.print("#" + i + ", ");
        }
        System.out.println("Count = " + count);
    }
}
/*
While Statement: 
#2, #3, #4, #5, #6, Count = 7
--------------
Do While Statement: 
#1, #2, #3, #4, #5, #6, Count = 7
--------------
For Statement: 
#0, #1, #2, #3, #4, #5, #6, Count = 7
*/
