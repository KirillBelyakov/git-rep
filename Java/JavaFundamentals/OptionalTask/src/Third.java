import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int arrayLength = scan.nextInt();//количество необходимы чисел
        String numbers[] = new String[arrayLength];//создаём массив заданной длинны
        int i;
        for (i = 0; i < arrayLength; i++) {// вводим все элементы массива
            System.out.println("Введите число:");
            numbers[i] = scan.next();
        }

        int summaryLength = 0;//суммарная длинна элементов массива
        for (i = 0; i < arrayLength; i++) {
            summaryLength += numbers[i].length();
        }
        int averageLength = summaryLength / 2;//получаем среднюю длинну элементов массива

        for (i = 0; i < arrayLength; i++) {
            if (numbers[i].length() > averageLength) {//сравнивем длинну элемента массива со средней длинной
                //и выводим элемент массива и его длинну, если она больше средней
                System.out.println(numbers[i] + " Длинна=" + numbers[i].length());
            }
        }
    }
}
