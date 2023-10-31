import java.util.Scanner;

public class ProgramUI {

    private ProgramCalculator calculator;

    public ProgramUI(ProgramCalculator calculator) {
        this.calculator = calculator;
        start();
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Калькулятор программиста");

        while (true) {
            int systemNumber = chooseSystemNumber(in);

            if (systemNumber == 5) {
                System.out.println("Программа завершена.");
                System.exit(0);
            }

            int op = chooseOperator(in);
            String num1 = inNum1(in);

            String result = calculator.calculate(op, systemNumber, num1);
            System.out.println("Результат: " + result);
        }
    }

    private int chooseSystemNumber(Scanner in) {
        System.out.println("Система счисления: ");
        System.out.println("1. hex");
        System.out.println("2. dec");
        System.out.println("3. oct");
        System.out.println("4. bin");
        System.out.println("5. Выход");
        return in.nextInt();
    }

    private int chooseOperator(Scanner in) {
        System.out.println("Перевод в: ");
        System.out.println("1. hex");
        System.out.println("2. dec");
        System.out.println("3. oct");
        System.out.println("4. bin");
        return in.nextInt();
    }

    private String inNum1(Scanner in) {
        System.out.println("Ввод 1 числа:");
        return in.next();
    }
}

