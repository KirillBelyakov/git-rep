import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int arrayLength = scan.nextInt();//количество необходимы чисел
        String numbers[] = new String[arrayLength];//создаём массив заданной длинны
        int i;
        for (i = 0; i < arrayLength; i++) {// вводим все элементы массива
            System.out.println("Введите число:");
            numbers[i] = scan.next(); }
        for (int j = arrayLength - 1; j > 0; j--) {
            for (int k = 0; k < j; k++) {
                if (numbers[k].length() > numbers[k + 1].length()) {//сравниваем элементы, если 1й элемент больше
                    String reverse = numbers[k];                    // второго то меняем их местами
                    numbers[k] = numbers[k + 1];                   //для того что бы числа не возрастали, а убывали
                    numbers[k + 1] = reverse;                      // необходимо заменить больше(>) на меньше(<)
                }
            }
        }
        for (int j = 0; j < numbers.length; j++) {//выводим на экран полученные значения
            System.out.println(numbers[j]);
        }
    }
}