import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        String value = scanner.nextLine();
        for(int i = value.length() - 1; i >= 0; i--) {
            System.out.print(value.charAt(i));
        }
    }
}
