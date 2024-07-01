import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    calculateSum();
                    break;
                case 2:
                    calculateAverage();
                    break;
                case 3:
                    checkPrimeNumber();
                    break;
                case 4:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Calculate Sum");
        System.out.println("2. Calculate Average");
        System.out.println("3. Check Prime Number");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void calculateSum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    private static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of numbers: ");
        int count = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += scanner.nextDouble();
        }

        double average = sum / count;
        System.out.println("The average is: " + average);
    }

    private static void checkPrimeNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    private static void exitProgram() {
        System.out.println("Exiting the program...");
        System.exit(0); // Terminate the program
    }
}
