import java.util.Scanner;
public class Ch2Ex8{
    public static void main(String[] args){
        //the time is given in GTM.Have to print it to local time in Banladesh
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the time in GTM (hours and minutes and seconds) : ");
        int hours = scan.nextInt();
        int minutes = scan.nextInt();
        int seconds = scan.nextInt();
        System.out.println("Local time: " + (hours+6) + ":" + minutes + ":" + seconds); 
    }
}
