import java.util.Scanner;
public class Third {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество случайных чисел:");
        int quantity = scan.nextInt();//количество необходимы чисел
        int number;
        for (int i = 0; i < quantity; i++) {
            number = (int)(Math.random() * 100);
            if (number % 2 == 0)
                System.out.println(number);// выводим четные числа с новой строки
            else
                System.out.print(number+",");// выводим нечетные числа через запятую в одну строку
        }
    }
}


