

import java.util.Scanner;

/**
 * 4) Посчитать произведение положительных И сумму нечетных чисел
 */
public class Hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summPositivNumbers=1;
        int summOddNumbers=0;
        int a = scanner.nextInt();
        while(a!=0){
            if(a>0){
                summPositivNumbers*=a;
            }
            if(a%2!=0){
                summOddNumbers+=a;
            }
         
            a = scanner.nextInt();
        }
        System.out.println("произведение положительных чисел: "+summPositivNumbers);
        System.out.println("Сумма нечетных чисел: "+ summOddNumbers);
    }
}
