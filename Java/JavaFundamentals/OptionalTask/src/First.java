import java.util.Scanner;
public class First {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
    int arrayLength = scan.nextInt();//количество необходимы чисел
    String numbers[] = new String[arrayLength];//создаём массив заданной длинны
    int i;
        for(i=0;i<arrayLength;i++){// вводим все элементы массива
        System.out.println("Введите число:");
        numbers[i] = scan.next(); }

        String number1 =numbers[0];//элемент массива
        int max=numbers[0].length();//принимаем 1й элемент массива  как максимальное значение
     for(i=0;i<arrayLength;i++){
         if(numbers[i].length()>max){//проходим по всему массиву,какждый раз когда число оказалось больше
             max= numbers[i].length();//максимального, присваеваем ему значение максимального
             number1=numbers[i]; } }
        System.out.println("Длинное число:"+number1+" Его длинна:"+max);

        String number2 =numbers[0];//элемент массива
        int min=numbers[0].length();//принимаем 1й элемент массива  как минимальное значение
        for(i=0;i<arrayLength;i++){
            if(numbers[i].length()<min){//проходим по всему массиву,какждый раз когда число оказалось меньше
                min= numbers[i].length();//минимального, присваеваем ему значение минимального
                number2=numbers[i]; } }
        System.out.println("Короткое число:"+number2+" Его длинна:"+min);
    }
}