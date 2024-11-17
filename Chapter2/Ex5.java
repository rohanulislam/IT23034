import java.util.Scanner;
public class Ch2Ex5{
    public static void main(String[] args){
        //given subtotal and gratuity rate,have to print gratuity and total;
        Scanner scan = new Scanner(System.in);
        double subtotal = scan.nextDouble();
        double gratuityRate = scan.nextDouble();
        
        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;
        
        System.out.println("Gratuity = " + gratuity);
        System.out.println("Total = " + total); 
    }
}
