import java.util.Scanner;
/*Write a Java program to add 10 numeric values to an array. Then find the minimum, maximum,
sum, and average values in that array.*/

public class ex1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10number:");
        int [] number = new int[10];

        for(int i = 0; i<10 ; i++){
            number[i] = input.nextInt();

        }

        int max = number[0];
        int min = number[0];
        int sum = number[0];
        double avg = 0;
        for(int i = 1; i<10 ; i++){
            if(number[i]>max){
                max = number[i];
            }
            if(number[i]<min){
                min = number[i];
            }
            sum = number[i]+sum;
        }

        avg = (double)sum/10;


        System.out.println("Minimum value:"+min);
        System.out.println("Maximum value:"+max);
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+avg);
    }
}

