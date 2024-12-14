package ict22.ClassNames;

public class NumberConversionClass {
    private static NumberConversionClass instance = null;

    private NumberConversionClass() {}

    public static NumberConversionClass getInstance() {
        if (instance == null) {
            instance = new NumberConversionClass();
        }
        return instance;
    }
    public String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    public String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal);
    }
    public String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }
    public int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
    public int hexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
    public int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }
}
