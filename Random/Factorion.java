import java.util.Scanner;
public class Factorion {
    public static int factorial(int num){
        if (num == 0 || num == 1)
        {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static boolean isFactorion(int n) {
        int k = n;
        int sum = 0;

        while (k > 0)
        {
            int digit = k % 10;
            sum += factorial(digit);
            k /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lb = scan.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upb = scan.nextInt();
        System.out.println("Factorion numbers in the range:");
        for (int i = lb ;i <= upb; i++)
        {
            if (isFactorion(i))
            {
                System.out.println(i);
            }
        }
    }
}
