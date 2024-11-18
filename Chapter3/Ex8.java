import java.util.Scanner;
import java.util.Arrays;
public class Ch3Ex8 {
    public static void main(String[] args) {
        // Three numbers will be input.have to print them in non-decreasing order.
        int[] array = new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Numbers in non-decreasing order:");
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
