import java.util.Scanner;
public class Ch2Ex9{
    public static void main(String[] args){
        //given the starting velocity,current velocity and time.Have to calculate accelaration
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter v0,v1 and t :");
        double v0 = scan.nextDouble();
        double v1 = scan.nextDouble();
        double t = scan.nextDouble();
        double acceleration = (v1 - v0) / t;
        System.out.println("The acceleration is: " + acceleration);
    }
}
