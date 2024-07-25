import java.util.Scanner;
/*Write a Java program to implement the bubble sort algorithm and sort an integer array.
Your program should:
● Prompt the user to input 10 integer values.
● Use the bubble sort algorithm to sort the array in ascending order.
● Display the sorted array.
*/

public class ex2_2 {
    public static void bubblesort(int arr[] ){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            for(int j = 0;j< n - 1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int [] arr = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("enter 10 numbers:");
        for(int i = 0;i<10;i++){
            arr[i] = input.nextInt();
        }
        bubblesort(arr);

        for(int i = 0;i<10;i++){
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
