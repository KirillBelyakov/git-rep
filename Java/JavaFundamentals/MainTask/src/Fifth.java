import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {

        String month[] = {"January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"};
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Введите номер месяца:");
            int number=scan.nextInt();
            if(number>0&&number<=12){
            System.out.println(month[number - 1]);}
            else System.out.println("Введите число от 1 до 12"); }
        catch (InputMismatchException e){
            System.out.println("Введите целое число");
        }
    }
}