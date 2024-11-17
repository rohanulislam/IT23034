import java.util.Scanner;
public class Ch2Ex7{
    public static void main(String[] args){
        //given the number of minutes.have to calculate years and days
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of minutes : ");
        int minutes = scan.nextInt();
        int years = minutes / (60 * 24 * 365);
        int remainingMinutes = minutes % (60 * 24 * 365);
        int days = remainingMinutes / (60 * 24);
        System.out.println(years + " years and " + days + " days ");
    }
}
