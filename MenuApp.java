import java.util.Scanner;
public class MenuApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    calculateArea();
                    break;
                case 2:
                    convertTemperature();
                    break;
                case 3:
                    printRandomNumber();
                    break;
                case 4:
                    exitApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        System.out.println("Thank you for using the application!");
    }

    private static void displayMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Calculate Area");
        System.out.println("2. Convert Temperature");
        System.out.println("3. Print Random Number");
        System.out.println("4. Exit Application");
        System.out.print("Enter your choice (1-4): ");
    }

    private static void calculateArea() {
        System.out.print("Enter the shape (square, triangle, circle): ");
        String shape = scanner.nextLine().toLowerCase();

        switch (shape) {
            case "square":
                System.out.print("Enter side length: ");
                double sideLength = scanner.nextDouble();
                System.out.println("Area of square: " + (sideLength * sideLength));
                break;
            case "triangle":
                System.out.print("Enter base of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of triangle: " + (0.5 * base * height));
                break;
            case "circle":
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of circle: " + (Math.PI * radius * radius));
                break;
            default:
                System.out.println("Invalid shape.");
        }
    }

    private static void convertTemperature() {
        System.out.print("Enter initial temperature scale (Celsius/Fahrenheit): ");
        String initialScale = scanner.nextLine().toLowerCase();
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        switch (initialScale) {
            case "celsius":
                double fahrenheit = (temperature * 9.0 / 5.0) + 32.0;
                System.out.println(temperature + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
                break;
            case "fahrenheit":
                double celsius = (temperature - 32.0) * 5.0 / 9.0;
                System.out.println(temperature + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
                break;
            default:
                System.out.println("Invalid initial temperature scale.");
        }
    }

    private static void printRandomNumber() {
        System.out.print("Enter lower bound: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter upper bound: ");
        int upperBound = scanner.nextInt();

        if (lowerBound > upperBound) {
            System.out.println("Lower bound cannot be greater than upper bound.");
            return;
        }

        int randomNumber = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
        System.out.println("Random number between " + lowerBound + " and " + upperBound + ": " + randomNumber);
    }

    private static void exitApplication() {
        System.out.println("Exiting application...");
    }
}
