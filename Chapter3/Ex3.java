import java.util.Scanner;
public class Ch3Ex3{
    public static void main(String[] args){
          //given a,b,c,d,e,f.Have to calculate x and y using cramers rule
          Scanner scan = new Scanner(System.in);
          System.out.print("Enter the coefficients of the system of equations: ");
          double a = scan.nextDouble();
          double b = scan.nextDouble();
          double c = scan.nextDouble();
          double d = scan.nextDouble();
          double e = scan.nextDouble();
          double f = scan.nextDouble();
          double determinant = a * d - b * c;
          if(determinant == 0)
          {
              System.out.println("The system has no solution");
              return;
          }
          double x = (e * d - b * f) / determinant;
          double y = (a * f - e * c) / determinant;
          System.out.println("The solutions are x = " + x + " and y = " + y);

    }
}
