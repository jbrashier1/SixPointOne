/**
 * Created by jackbrashier on 4/25/17.
 */
public class CalcDriver {

    public static void main(String [] args) {
        
        System.out.println("\nCalculator.sum(5.4, 6.6): " + Calculator.sum(5.4, 6.6));

        System.out.println("\nCalculator.average(5.4, 6.6): " + Calculator.average(5.4, 6.6));

        System.out.println("\nCalculator.multiply(5.4, 6.6): " + Calculator.multiply(5.4, 6.6));

        double [] sumArr = {1.0, 5.0, 2.0, 9.0, 7.0, 4.0, 2.0, 6.0};

        System.out.println("sumArr = {1, 5, 2, 9, 7, 4, 2, 6}");

        System.out.println("\nCalculator.sum(sumArr): " + Calculator.sum(sumArr));

        System.out.println("\nCalculator.average(sumArr): " + Calculator.average(sumArr));

        System.out.println("\nCalculator.multiply(sumArr): " + Calculator.multiply(sumArr));
    }
}
