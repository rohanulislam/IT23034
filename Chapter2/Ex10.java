import java.util.Scanner;
public class Ch2Ex10{
    public static void main(String[] args){
        //Given the amount of water,initial temperature,final temperature.Have to calculate needed energy
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of water (in kg), initial temperature , and final temperature: ");
        double M = scan.nextDouble();
        double initialTemp = scan.nextDouble();
        double finalTemp = scan.nextDouble();
        System.out.println("Energy needed is " + M * (finalTemp - initialTemp) * 4184);
    }
}
