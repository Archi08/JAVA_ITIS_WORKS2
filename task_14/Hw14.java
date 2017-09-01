
/**
 * Написать функции, которые ищут минимальный и максимальный элементы массива
 */
public class Hw14 {
    public static void main(String[] args) {
        int[] numbers = {789,190,24,100,999,34,54,67};
        System.out.println("Минимальное число в массиве "+minIsArray(numbers));
        System.out.println("Максимальное число в массиве "+maxIsArray(numbers));
    }
    public static int minIsArray(int[] numbers){
        int min = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    }
    public static int maxIsArray(int[] numbers){
        int max = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }
}
