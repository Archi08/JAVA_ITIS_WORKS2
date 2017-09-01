
import java.util.Random;
import java.util.Scanner;

/**
 * 18) Написать процедуру, котрая выводит максимальное число на побочной диагонали квадратной матрицы
 */
public class Hw18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int max=0;
        System.out.println("Введите значение строк и колонн квадратной матрицы: ");
        int lineAndColumn = scanner.nextInt();
        int[][] array = new int[lineAndColumn][lineAndColumn];
        for(int i =0;i<array.length;i++){
            for(int j = 0;j<array[0].length;j++){
                array[i][j]=random.nextInt(89)+10; // от 10 - 99
            }
        }
        System.out.println("Массив построен:");
        for(int i=0;i<array.length;i++){
            for(int j =0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Максимальное число побочной диаганали матрицы");
        for(int i = array.length-1;i>=0;){
            max = array[i][0];
            for(int j=0;j<array[0].length;j++,i--){
                if(array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        //выводим результат
        System.out.println(max);
    }
}
