

import java.util.Scanner;

/**
 *3) Посчитать сумму отрицательных чисел
 */
public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        int a = scanner.nextInt();
        while(a!=0){
            if(a<0)
                summ+=a;
            a = scanner.nextInt();
        }
        System.out.println("Сумма отрицательных чисел равна: "+summ);
    }
}
