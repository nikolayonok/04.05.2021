import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение в метрах ");
        double metr = scanner.nextDouble();
        double sant = metr * 100;
        System.out.println("Сантиметры: " + sant);
        double dec = metr * 10;
        System.out.println("Дециметры: " + dec);
        double mili = metr * 1000;
        System.out.println("Миллиметры: " + mili);
        double miles = metr / 1600;
        System.out.println(" Мили: " + miles);




//        double metrs = scanner.nextInt();
//        double sant = metrs * 100;
//        double dec = sant * 10;
//        double mili = sant * 100;
//        double mils = metrs * 1.6;
//
//        System.out.println(sant, dec, mili, mils);





    }
}
