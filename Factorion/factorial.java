public class factorial{
    public static int factorial(int num){ 
        if (num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
