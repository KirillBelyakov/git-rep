import java.util.Scanner;

public class Forth {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int arrayLength = scan.nextInt();//количество необходимы чисел
        int numbers[] = new int[arrayLength];//создаём массив заданной длинны
        int i=0;
        for (i=0; i < arrayLength; i++) {// вводим все элементы массива
            System.out.println("Введите число:");
            numbers[i] = scan.nextInt();
        }
        int sum=0;//сумма чисел
        for( i=0;i< arrayLength;i++){
            sum+=numbers[i];
        }
        System.out.println("Сумма чисел равна="+sum);

        int multiplication=1;//произведение чисел
        for( i=0;i< arrayLength;i++){
            multiplication*=numbers[i];
        }
        System.out.println("Произведение чисел ="+multiplication);


    }
}
