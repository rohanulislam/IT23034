package ict22.ClassNames;
public class Sum {
    private Sum() {}
    public static SumClass getInstance() {
        if (instance == null) {
            instance = new SumClass();
        }
        return instance;
    }
    public double sumUp(int terms) {
        double sum = 0.0;
        for (int i = 1; i <= terms; i++) {
            sum += 1.0 / Math.pow(10, i - 1);
        }
        return sum;
    }
}
