import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Введите число и нажмите <Enter>");
        System.out.println("Введите число и нажмите <Enter>");


        while (true) {
            int value = new Scanner(System.in).nextInt();
            if (value > 0) {
                sum = sum + value;
                System.out.println("Сумма: " + sum);
                System.out.println("Введите еще одно число или 0 для сброса");
            }
            else  {
                sum = 0;
                System.out.println("Сумма сброшена. Введите новое число:");
            }
        }
    }
}

