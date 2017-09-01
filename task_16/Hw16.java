
import java.util.Random;
import java.util.Scanner;

/**
 * 16) Написать процедуру, которая выводит минимальные числа в каждой строке
 */
public class Hw16 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве");
        int lines = scanner.nextInt();
        System.out.println("Введите количество столбцов в массиве");
        int column = scanner.nextInt();
        int[][] array = new int[lines][column];
        int[] arrayForMin = new int[array.length];
        for(int i=0;i<array.length;i++){
            for(int j = 0; j<array[0].length;j++){
                array[i][j] = random.nextInt(89)+10; // от 10 до 99  рандомные число.
            }
        }
        System.out.println("Массив построен: ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Минимальное число в каждой строке:");
        for(int i=0;i<array.length;i++){
            int min = array[i][0];
            for(int j=1;j<array[0].length;j++){
                if(array[i][j]<min){
                    min = array[i][j];
                }
            }
            arrayForMin[i] = min;
        }
        for(int i=0;i<arrayForMin.length;i++){
            System.out.println(arrayForMin[i]);
        }

    }
}
