/**
 * Scanning user inputs first then summing the inputted numbers.
 * by @xennia316
 */
import java.util.Scanner;
public class AddTwoNumbers2
{
    public stsatic void main(string[] args)
    {
        int num1, num2, sum;
        Scanner sc = new Scanner(System .in);

        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out,println("Enter second number: ");
        num2 = sc. nextInt();

        sc.close();

        sum = num1 + num2;

        System.out.println("sum of these numbers: "+sum);

    }
}