package ict22.ClassNames;

public class Print {
    private static CustomPrintClass instance;

    private Print() {}

    public static CustomPrintClass getInstance() {
        if (instance == null) {
            instance = new CustomPrintClass();
        }
        return instance;
    }

    // Custom print method
    public void pr(String message) {
        System.out.println("Custom Print: " + message);
    }
}
