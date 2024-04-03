import java.util.Scanner;

public class bonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter the year the employee joined: ");
        int joinedYear = scanner.nextInt();
        int yearsOfService = currentYear - joinedYear;
        int bonusAmount = 0;
        if (yearsOfService > 5) {
            bonusAmount = 5000;
        } else if (yearsOfService >= 3) {
            bonusAmount = 3000;
        }
        if (bonusAmount > 0) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. " + bonusAmount);
        } else {
            System.out.println("Sorry, no bonus is awarded.");
        }
        scanner.close();
    }
}