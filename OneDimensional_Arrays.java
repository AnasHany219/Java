package one.dimensional_arrays;

import java.util.Scanner;

/*
An array is a container object that holds a fixed number of values of a single type
*/
public class OneDimensional_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int arr[] = new int[5];
        System.out.print("Enter 5 elemetns: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.print("The elemetns are : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe sum of the elemetns = " + sum);
    }
}
/*
Enter 5 elemetns: 1 2 3 4 5
The elemetns are : 1 2 3 4 5 
The sum of the elemetns = 15
*/
