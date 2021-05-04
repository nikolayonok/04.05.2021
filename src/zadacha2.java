import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число ");
        int num = scanner.nextInt();
        int num0 = num /1000;
        int num1 = num / 100 % 10;
        int num2 = num / 10 % 10;
        int num3 = num % 10;
        System.out.println(num0 * num1 * num2 * num3);


    }
}
