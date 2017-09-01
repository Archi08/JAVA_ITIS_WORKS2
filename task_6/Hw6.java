

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6) Посчитать сумму чисел, порядок вхождения которых - четное число
 */
public class Hw6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       int summ=0;
       int a = scanner.nextInt();
       while(a!=0){ // заполняем массив числами
           numbers.add(a);
           a = scanner.nextInt();
       }
       for(int i=0;i<numbers.size();i++){
           if(i%2==0 && i!=0){
               summ+=numbers.get(i);
           }
       }
        System.out.println("Сумма чисел с четным порядком вхождения: "+summ);

    }
}
