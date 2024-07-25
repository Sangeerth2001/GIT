import java.util.Scanner;


public class ex2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Please enter 10 integer values:");
        for (int i = 0; i < 10; i++) {

            array[i] = scanner.nextInt();
        }

        insertionSort(array);

        System.out.println("Sorted array in ascending order:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
