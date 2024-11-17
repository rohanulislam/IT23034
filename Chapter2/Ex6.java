import java.util.Scanner;
public class Ch2Ex6{
    public static void main(String[] args){
        //sum of digits
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        int number = scan.nextInt();
        int sum = 0;
        while(number!=0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
