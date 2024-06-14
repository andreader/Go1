import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }
        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.print(number);
        }

        System.out.println();
        System.out.println("Калькулятор");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль");
                } else {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Ошибка: неверная операция");
        }

        scanner.close();
    }
}
