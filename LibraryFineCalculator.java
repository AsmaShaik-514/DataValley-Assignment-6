import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();
        int fine = 0;
        if (daysLate >= 1 && daysLate <= 7) {
            fine = daysLate * 50; 
        } else if (daysLate >= 8 && daysLate <= 14) {
            fine = daysLate * 100; 
        } else if (daysLate > 14 && daysLate <= 21) {
            fine = 5 * 100; 
        } else if (daysLate > 21) {
            System.out.println("Your membership is canceled due to late return beyond 21 days.");
            System.exit(0);
        }

        if (fine > 0) {
            System.out.println("Fine: Rs. " + (fine / 100.0)); 
        } else {
            System.out.println("No fine.");
        }

        scanner.close();
    }
}