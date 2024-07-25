import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Please enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        findAndPrintDuplicates(numbers);

        scanner.close();
    }

    public static void findAndPrintDuplicates(int[] array) {
        System.out.println("Duplicate values:");

        boolean hasDuplicates = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}
