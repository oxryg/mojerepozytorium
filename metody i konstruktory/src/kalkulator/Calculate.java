package kalkulator;

public class Calculate {
    public static void main(String[] args) {

        double x = 7;
        double y = 9.5;

        Calculator calculator = new Calculator();
        calculator.add(x, y);
        calculator.subtract(x, y);
        calculator.multiply(x, y);
        calculator.divide(x, y);

    }

}
