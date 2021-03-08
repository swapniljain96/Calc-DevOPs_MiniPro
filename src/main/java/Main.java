import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.rmi.runtime.Log;

import java.util.Scanner;

public class Main {

    private static final Logger Logger = LogManager.getLogger(Main.class);

    public static double squareroot(double number1) {
        Logger.info("Performing SQUARE ROOT of " + number1 + " result: " + Math.sqrt(number1));
        return Math.sqrt(number1);
    }

    public static double factorials(double number1) {
        int i, fact = 1;
        for (i = 1; i <= number1; i++) {
            fact = fact * i;
        }
        return fact;
    }


    public static double naturallog(double number1) {
        return Math.log(number1);
    }

    public static double powerfun(double number1, double number2) {
        return Math.pow(number1, number2);
    }

    public static void main(String args[]) {
        int flag = 0, ch;
        double var1, var2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator System");
        do {
            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Square Root");
            System.out.println("2) Factorial");
            System.out.println("3) Natural Logarithim");
            System.out.println("4) Power Function");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            ch = reader.nextInt();
            if (ch == 5) {
                flag = 1;
            } else {
                switch (ch) {
                    case 1:
                        System.out.println("Square root");
                        System.out.println("Enter number");
                        var1 = reader.nextDouble();
                        System.out.println("Squre root of "+var1+" is : "+squareroot(var1));
                        break;
                    case 2:
                        System.out.println("Factorial");
                        System.out.println("Enter number");
                        var1 = reader.nextDouble();
                        System.out.println("Factorial of " + var1 + " is: " + factorials(var1));
                        break;
                    case 3:
                        System.out.println("Natural Logarithim");
                        System.out.println("Enter number");
                        var1 = reader.nextDouble();
                        System.out.println("Natural Logarithm of "+var1+" is: "+naturallog(var1));
                        break;
                    case 4:
                        System.out.println("Power function");
                        System.out.println("Enter two numbers");
                        System.out.print("Enter number 1: ");
                        var1 = reader.nextDouble();
                        System.out.print("Enter number 2: ");
                        var2 = reader.nextDouble();
                        System.out.println(var1+"^"+var2+" is : "+powerfun(var1,var2));
                        break;
                    default:
                        System.out.println("Exiting program due to invalid input");
                        flag = 1;
                }
            }
            System.out.println("\n");
        } while (flag == 0);

    }
}
