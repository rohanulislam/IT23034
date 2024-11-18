import java.util.Scanner;
public class Ch3Ex7{
    public static void main(String[] args){
          //singular and plural words
          Scanner scan = new Scanner(System.in);
          int dollar = scan.nextInt();
          int penny = scan.nextInt();
          if(dollar==1)System.out.println(dollar + " dollar");
          else System.out.println(dollar + " dollars");
          if(penny==1)System.out.println(penny + " penny");
          else System.out.println(penny + " pennies");
    }
}
