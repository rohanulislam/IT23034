import java.util.Scanner;
public class Ch2Ex20{
    public static void main(String[] args){
          //given balance and annual interest rate.havo to calculate the interest
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter the initial balance: ");
          double initialBalance = scan.nextDouble();
          System.out.print("Enter the annual interest rate (in decimal form): ");
          double annualInterestRate = scan.nextDouble();
          double interest = initialBalance * annualInterestRate/1200;
          System.out.println("The interest is " + interest);

    }
}
