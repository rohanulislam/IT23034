import java.util.Scanner;
public class Mainclass{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius = scan.nextDouble();
        Circle circle = new Circle();
        circle.setRadius(radius);
        System.out.println("Area of the circle with radius " + circle.getRadius() + " is " + circle.Area());
    }
}
