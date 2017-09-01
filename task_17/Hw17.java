
import java.util.Random;
import java.util.Scanner;

/**
 * 17) Написать процедуру, которая выводит минимальные числа в каждом столбце
 */
public class Hw17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк массива: ");
        int lines = scanner.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int column = scanner.nextInt();
        int[][] array = new int[lines][column];
        int[] arrayForMin = new int[array[0].length];
        for(int i =0;i<array.length;i++){
            for(int j =0;j<array[0].length;j++){
                array[i][j] = random.nextInt(89)+10;
            }
        }
        System.out.println("Массив построен:");
        for(int i =0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Минимальные значения в столбцах: ");
        for(int i=0;i<array[0].length;i++){
            int min = array[0][i];
            for(int j = 1;j<array.length;j++){
                if(array[j][i]<min){
                    min = array[j][i];
                }
            }
            arrayForMin[i] = min;
        }
        for(int i =0;i<arrayForMin.length;i++){
            System.out.println(arrayForMin[i]);
        }
    }
}
