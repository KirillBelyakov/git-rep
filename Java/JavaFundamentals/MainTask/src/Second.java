import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите аргументы:");
            String line = scan.nextLine();
            String reversedString = new StringBuffer(line).reverse().toString();
            System.out.println(reversedString);
            scan.close();
        }
    }
