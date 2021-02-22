import java.util.*;
import static java.lang.System.exit;

public class Main
{
    public static void main(String[] args)
    {
        int ch;
        double var1,var2;
        Scanner reader = new Scanner(System.in);
        System.out.println("~~~~~~~!! Calculator System !!~~~~~~");
        while(true)
        {
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power(Exponential)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = reader.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("-----Square Root-----");
                    System.out.print("Enter the number : ");
                    var1 = reader.nextDouble();
                    System.out.println("Squre root of "+var1+" is : "+Math.sqrt(var1));
                    break;
                case 2:
                    System.out.println("-----Factorial-----");
                    System.out.print("Enter the number : ");
                    var1 = reader.nextDouble();
                    double var;
                    var = fact(var1);
                    System.out.println("Factorial of "+var1+" is: "+var);
                    break;
                case 3:
                    System.out.println("-----Natural Logarithm-----");
                    System.out.print("Enter the number: ");
                    var1 = reader.nextDouble();
                    System.out.println("Natural Logarithm of "+var1+" is: "+Math.log(var1));
                    break;
                case 4:
                    System.out.println("-----Power(Exponential)-----");
                    System.out.print("Enter the base number : ");
                    var1 = reader.nextDouble();
                    System.out.print("Enter power to the number : ");
                    var2 = reader.nextDouble();
                    System.out.println(var1+"^"+var2+" is : "+Math.pow(var1,var2));
                    break;
                case 5: exit(0);
                default: System.out.println("Invalid Input !!!!!");
            }
            System.out.println("\n");
        }
    }

    private static double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
}
