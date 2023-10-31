public class EngineerCalculator extends Calculator {

    public double sin(double num) {
        return Math.sin(num);
    }

    public double cos(double num) {
        return Math.cos(num);
    }

    public double tan(double num) {
        return Math.tan(num);
    }

    public double xInSquare(double num1) {
        return Math.pow(num1, 2);
    }

    public double xInDegree(double num1) {
        if (num1 < 0) {
            throw new IllegalArgumentException("Невозможно извлечь корень из отрицательного числа!");
        }
        return Math.sqrt(num1);
    }


    @Override
    public double calculate(int op, double num1, double num2) {
        if (op >= 7 && op <= 11) {
            switch (op) {
                case 7:
                    return xInSquare(num1);
                case 8:
                    return xInDegree(num1);
                case 9:
                    return sin(num1);
                case 10:
                    return cos(num1);
                case 11:
                    return tan(num1);
            }
        }
        return super.calculate(op, num1, num2);
    }
}
