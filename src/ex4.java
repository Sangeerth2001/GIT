import java.util.Scanner;


public class ex4 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[10];

            System.out.println("Please enter 10 integer values:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter value " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            System.out.print("Enter the value to delete: ");
            int valueToDelete = scanner.nextInt();

            numbers = deleteValue(numbers, valueToDelete);

            System.out.println("Array after deleting the value:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

            scanner.close();
        }

        public static int[] deleteValue(int[] array, int value) {
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    count++;
                }
            }

            int[] newArray = new int[array.length - count];
            int index = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] != value) {
                    newArray[index++] = array[i];
                }
            }

            return newArray;
        }


}
