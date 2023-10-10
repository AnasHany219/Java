package passingarray_to_function;

import java.util.Scanner;

public class PassingArray_To_Function {
    public static void InsertionSort(int arr[], int size){
        for(int i = 1; i < size; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();
        
        int arr[] = new int[size];
        
        System.out.print("Enter " + size + "Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        
        InsertionSort(arr, size);
        
        System.out.print("The Element After Insertion_Sort: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
/*
Enter the size of array: 5
Enter 5Elements : 5 4 3 2 1
The Element After Insertion_Sort: 1 2 3 4 5
*/
