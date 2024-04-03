import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter a number (enter '0' to stop): ");
            int number = scanner.nextInt();

            if (number == 0) {
                continueInput = false;
            } else {
                sum += number;
                count++;

                if (number < smallest) {
                    smallest = number;
                }

                if (number > largest) {
                    largest = number;
                }
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average of all numbers: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}