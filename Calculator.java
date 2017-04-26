/**
 * Created by jackbrashier on 4/25/17.
 */
public class Calculator {
    public static double sum(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
    public static double average(double num1, double num2) {
        double result = (num1 + num2) / 2;
        return result;
    }
    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double sum(double [] numArr1) {
       double result = 0;
       for(int i = 0; i < numArr1.length; i++) {
           result = result + numArr1[i];
       }
       return result;
    }
    public static double average(double [] numArr1) {
        double result = (Calculator.sum(numArr1) / (numArr1.length));
        return result;
    }
    public static double multiply(double [] numArr1) {
        double result = 1;
        for(int i = 0; i < numArr1.length; i++) {
            result = result * numArr1[i];
        }
        return result;
    }
}
