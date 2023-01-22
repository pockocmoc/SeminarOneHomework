package task_1;
/*
  Написать программу вычисления n-ого треугольного числа.(Junit тесты прилагаются.)
 */


import java.util.Scanner;

public class MyProgram {

    public static int numberEntry() {

        boolean isReady = false;
        int n = 0;
        String inputError = "Ошибка!!!\nВведите число больше или равное нулю.";
        String inputErrorStr = "Ошибка!!! Вы ввели не число!!!\nВведите число больше или равное нулю.";
        while (!isReady) {
            try {
                Scanner scanner = new Scanner(System.in);
                n = scanner.nextInt();
                if (n >= 0)
                    isReady = true;
                else
                    System.out.println(inputError);
            } catch (Exception e) {
                System.out.println(inputErrorStr);
            }
        }
        return n;
    }

    public static String header() {
        return "Программа определяет n-треугольного числа.\n" +
                "Введите число: ";
    }
    public static String separator() {
        return "\n          ****************          ";
    }


    public static int solution(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(separator());
        System.out.println("\n" + header());
        int num = numberEntry();
        int result = solution(num);
        System.out.println("\nТреугольное число " + num + " равно: " + result);
        System.out.println(separator());

    }


}
