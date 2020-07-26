import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scan.nextLine();
        System.out.println("Приветсвтую вас," + name);
        scan.close();
    }
}