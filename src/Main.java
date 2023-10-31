import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выбор режима калькулятора:");
        System.out.println("1: Базовый калькулятор");
        System.out.println("2: Инженерный калькулятор");
        System.out.println("3: Программист");
        System.out.println("4: Выход");

        int mode = in.nextInt();
        switch (mode) {
            case 1 :
                new BasicUI(new Calculator());
            case 2 :
                new EngineerUI(new EngineerCalculator());
            case 3 :
                new ProgramUI(new ProgramCalculator());
            case 4 :
                System.out.println("Программа завершена.");
                System.exit(0);
            default :
                throw new IllegalArgumentException("Неправильный режим");
        }

    }
}