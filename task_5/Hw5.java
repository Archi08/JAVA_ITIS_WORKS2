

import java.util.Scanner;

/**
 * 5) Посчитать произведение чисел, сумма цифр которых оканчивается на 7
 */
public class Hw5 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int composition=1;
       int tmp=0;
       int a = scanner.nextInt();
       while(a!=0){
           // в этом цикле передаются числа, их может быть сколько угодно.
           int b = a; // копируем значение а, что бы не изменять его
           while(b!=0){
               //в этом цикле будем перебирать цифры и получать сумму
               tmp+=b%10;
               b= b/10;
           }
           if(tmp%10==7){ // проверяем оканчивается ли сумма цифр на 7
               composition*=a;
           }
           tmp =0;
           a =scanner.nextInt();
       }
        System.out.println("Произведение чисел "+composition);
    }
}
