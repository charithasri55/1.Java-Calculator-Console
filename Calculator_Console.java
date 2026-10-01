
import java.util.Scanner;

class Calculator_Console {

    //Addition Method
    public static double add(double a, double b) {
        return a + b;
    }

    //Subtraction Method
    public static double subtract(double a, double b) {
        return a - b;
    }

    //Multiplication Method
    public static double multiply(double a, double b) {
        return a * b;
    }

    //Division Method
    public static double division(double a, double b) {
        return a / b;
    }

    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("===Java Calculator Console===\n");

        while (running) {
            System.out.println("****Choose the Operation****");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit\n");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println();

            //Exit from the Calculator Console
            if (choice == 5) {
                running = false;
                System.out.println("Calculator Closed, Thank You\n");
                break;
            }

            //Check Invalid Choice
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Choice; Please try again\n");
                continue;
            }

            System.out.print("Enter the first number: ");
            double a = sc.nextDouble();
            System.out.println();

            System.out.print("Enter the second number: ");
            double b = sc.nextDouble();
            System.out.println();

            double result;

            switch (choice) {
                case 1:
                    result = add(a, b);
                    System.out.println("The result is: " + result+"\n");
                    break;
                case 2:
                    result = subtract(a, b);
                    System.out.println("The result is: " + result+"\n");
                    break;
                case 3:
                    result = multiply(a, b);
                    System.out.println("The result is: " + result+"\n");
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error: Number cannot divide by zero\n");
                    } else {
                        result = division(a, b);
                        System.out.println("The result is: " + result+"\n");
                    }
                    break;
            }
        }
        sc.close();
    }
     
}
