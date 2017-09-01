

import java.util.Scanner;

/**
 * 1) Клиент приходит в банк, и просит снять сумму определенную, надо вывести:
 5000 -
 1000 -
 500 -
 100 -
 50 -
 10 -
 5 -
 2 -
 1 -
 */
public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите вывести:");
        int a = scanner.nextInt();
        while(a!=0){
            System.out.println(a);
            a = scanner.nextInt();
        }
    }
}
