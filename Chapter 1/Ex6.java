public class Ch1Ex6 {
  public static void main(String[] args) {
    //sum of numbers from 1 to 9
    int sum=0;
    for(int i=1;i<=9;i++)
    {
        sum+=i;
        if(i<9)
        System.out.print(i+"+");
        else System.out.print(i+"=");
    }
    System.out.println(sum);
  }
 }
