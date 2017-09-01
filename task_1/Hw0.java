
import java.util.Scanner;

/**
 * Задача: есть набор чисел A = {a1, a2, ..., an}
 n -> бесконечность
 an = -1
 Посчитать сумму чисел. Посчитать сумму четных чисел.
 */
public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ =0; //сумма всех
        int even=0; // сумма четных
        int odd=0; //сумма нечетных
        int a = scanner.nextInt();
        while(a!=0){
            if(a%2==0){
                even+=a;
            }else{
                odd+=a;
            }
            summ+=a;
            a = scanner.nextInt();

        }
        System.out.println("Сумма четных чисел: "+even);
        System.out.println("Сумма нечетных чисел: "+odd);
        System.out.println("Сумма всех введенных чисел: "+summ);

    }
}
