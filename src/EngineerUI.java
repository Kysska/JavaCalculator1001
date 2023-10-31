import java.util.Scanner;

public class EngineerUI {

    private EngineerCalculator calculator;

    public EngineerUI(EngineerCalculator calculator) {
        this.calculator = calculator;
        start();
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Инженерный калькулятор");

        while (true) {
            int op = chooseOperator(in);
            if(op == 12){
                System.out.println("Программа завершена.");
                System.exit(0);
            }
            double num1 = inNum1(in);
            double num2 = 0;
            if(op >= 1 && op <= 4){
                num2 = inNum2(in);
            }

            double result = calculator.calculate(op, num1, num2);
            System.out.println("Результат: " + result);
        }
    }

    private int chooseOperator(Scanner in) {
        System.out.println("Выбор операции:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. +/-");
        System.out.println("6. 1/x");
        System.out.println("7. x²");
        System.out.println("8. √x");
        System.out.println("9. sin");
        System.out.println("10. cos");
        System.out.println("11. tan");
        System.out.println("12. Выход");
        return in.nextInt();
    }

    private double inNum1(Scanner in) {
        System.out.println("Ввод 1 числа:");
        return in.nextDouble();
    }

    private double inNum2(Scanner in) {
        System.out.println("Ввод 2 числа:");
        return in.nextDouble();
    }
}
