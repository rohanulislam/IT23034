import java.util.Scanner;
public class Ch2Ex3{
    public static void main(String[] args){
        //feet to meter
        Scanner scan = new Scanner(System.in);
        double feet = scan.nextDouble();
        double meter = feet * 0.305;
        System.out.println("Distance in meters = " + meter);
    }
}
