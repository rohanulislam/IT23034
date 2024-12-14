package ict22.ClassNames;
public class DMC {
    private static DivisorMultipleClass instance = null;
    private DivisorMultipleClass() {}
    public static DivisorMultipleClass getInstance() {
        if (instance == null) {
            instance = new DivisorMultipleClass();
        }
        return instance;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
