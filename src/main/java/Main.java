import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    private static final Logger Logger = LogManager.getLogger(Main.class);

    public static double squareroot(double number1) {
        Logger.info("Calculating square root  of given number:" + number1);
        Logger.info("Resultant answer of power operations is : " + Math.sqrt(number1));
        return Math.sqrt(number1);
    }

    public static double factorials(double number1) {
        Logger.info("Calculating factorial  of given number:" + number1);
        int i, fact = 1;
        for (i = 1; i <= number1; i++) {
            fact = fact * i;
        }
        Logger.info("Resultant answer of power operations is : " + fact);
        return fact;
    }

    public static double naturallog(double number1) {
        Logger.info("Calculating natural log  of given number:" + number1);
        Logger.info("Resultant answer of natural log operation is : " + Math.log(number1));
        return Math.log(number1);
    }

    public static double powerfun(double number1, double number2) {
        Logger.info("Calculating power function of given numbers:" + number1+","+number2);
        Logger.info("Resultant answer of power operation is : " + Math.pow(number1, number2));
        return Math.pow(number1, number2);
    }

    public static void main(String args[]) {
        int ch;
        double var1, var2;
        Scanner reader = new Scanner(System.in);
        System.out.println("~~~~~~~!! Calculator System !!~~~~~~");
        while (true) {
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power(Exponential)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = reader.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("---------------------------------------------------");
                    System.out.println("Square root");
                    System.out.print("Enter number: ");
                    var1 = reader.nextDouble();
                    System.out.println("Squre root of " + var1 + " is : " + squareroot(var1));
                    System.out.println("---------------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------------");
                    System.out.println("Factorial");
                    System.out.print("Enter number: ");
                    var1 = reader.nextDouble();
                    System.out.println("Factorial of " + var1 + " is: " + factorials(var1));
                    System.out.println("---------------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------------");
                    System.out.println("Natural Logarithim");
                    System.out.print("Enter number: ");
                    var1 = reader.nextDouble();
                    System.out.println("Natural Logarithm of " + var1 + " is: " + naturallog(var1));
                    System.out.println("---------------------------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------------------------");
                    System.out.println("Power function");
                    System.out.println("Enter two numbers");
                    System.out.print("Enter number 1: ");
                    var1 = reader.nextDouble();
                    System.out.print("Enter number 2: ");
                    var2 = reader.nextDouble();
                    System.out.println(var1 + "^" + var2 + " is : " + powerfun(var1, var2));
                    System.out.println("---------------------------------------------------");
                    break;
                case 5:
                    exit(0);
                default:
                    System.out.println("Invalid Input !!!!!");
            }
            System.out.println("\n");
        }
    }
}
