// Реализовать простой калькулятор, добавить логирование результатов

import java.util.Scanner;

public class Task_2_4 {
    static public void main(String[] args) {
        System.out.print("\033[H\033[J");
        System.out.println(
                "Реализуем простой калькулятор с возможностью выполнить сложение, вычитание, деление, умножение");
        Scanner iScanner = new Scanner(System.in);

        String answer = "1";
        while (answer == "1") {

            System.out.print("Введите первое число: ");
            double yourNumber1 = iScanner.nextDouble();

            System.out.print("Укажите арифметическое действие (+,-,*,/): ");
            String operation = System.console().readLine();

            System.out.print("Введите второе число: ");
            double yourNumber2 = iScanner.nextDouble();

            if (!(yourNumber2 == 0) && !(operation == "/")) {

                System.out.println("Результат:");

                switch (operation) {
                    case "*":
                        System.out.printf("%.2f * %.2f = %.2f\n", yourNumber1, yourNumber2, yourNumber1 * yourNumber2);
                        break;
                    case "/":
                        System.out.printf("%.2f / %.2f = %.2f\n", yourNumber1, yourNumber2, yourNumber1 / yourNumber2);
                        break;
                    case "+":
                        System.out.printf("%.2f + %.2f = %.2f\n", yourNumber1, yourNumber2, yourNumber1 + yourNumber2);
                        break;
                    case "-":
                        System.out.printf("%.2f - %.2f = %.2f\n", yourNumber1, yourNumber2, yourNumber1 - yourNumber2);
                        break;
                    default:
                        System.out.println("Ошибка при вводе исходных данных\n");
                        break;
                }

            } else {
                System.out.println("Деление на 0 приведёт к ошибке вычислений, повторите ввод\n");
            }
            answer = System.console().readLine("Продолжить (1 - да, 2 - нет)? ");
        }
        iScanner.close();
    }

}