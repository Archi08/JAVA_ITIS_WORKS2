

import java.util.Scanner;

/**
 * 2) Сумма цифр считанного числа
 */
public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        int summ=0;
        while(a!=0){
            summ+=a % 10;
            a = a / 10;
        }
        System.out.println(summ);
    }
}
