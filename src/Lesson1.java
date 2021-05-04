public class Lesson1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            if (i < 10) {
                System.out.println("Я меньше 10 " + i);
            } else {
                System.out.println("Я больше 10 " + i);
            }
            if (i == 10)
                System.out.println("Я равен 10");
            i++;
        }
    }


}
