//package ict22.ClassNames;
import ClassNames.Sum;
import ClassNames.NumberConversionClass;
import ClassNames.DMC;
import ClassNames.Print;
public class MainClass1 {
    public static void main(String[] args) {
        Sum sumInstance = Sum.getInstance();
        double sum = sumInstance.sumUp(5);
        DMC divisorMultipleInstance = DivisorMultipleClass.getInstance();
        int gcd = divisorMultipleInstance.gcd(56, 98);
        int lcm = divisorMultipleInstance.lcm(56, 98);
        Print customPrintInstance = CustomPrintClass.getInstance();
        Print.pr("GCD of 56 and 98: " + gcd);
        Print.pr("LCM of 56 and 98: " + lcm);
        NumberConversionClass numberConversionInstance = NumberConversionClass.getInstance();
        int decimal = 15;
        String binary = numberConversionInstance.decimalToBinary(decimal);
        String hex = numberConversionInstance.decimalToHexadecimal(decimal);
        String octal = numberConversionInstance.decimalToOctal(decimal);
        Print.pr("Decimal " + decimal + " in Binary: " + binary);
        Print.pr("Decimal " + decimal + " in Hexadecimal: " + hex);
        Print.pr("Decimal " + decimal + " in Octal: " + octal);
       
        Print.pr("Custom Print Method Example!");
    }
}

