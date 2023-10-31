public class Calculator {

    public double plus(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return num1 / num2;
    }

    public double plusMinus(double num1) {
        return num1 * (-1);
    }

    public double oneDivX(double num1) {
        if (num1 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return 1 / num1;
    }

    public double calculate(int op, double num1, double num2) {
        switch (op) {
            case 1:
                return plus(num1, num2);
            case 2:
                return minus(num1, num2);
            case 3:
                return multiply(num1, num2);
            case 4:
                return divide(num1, num2);
            case 5:
                return plusMinus(num1);
            case 6:
                return oneDivX(num1);
            default:
                throw new IllegalArgumentException("Неправильная операция");
        }
    }
}
