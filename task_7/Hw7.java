

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 7) Сумма чисел массива
 */
public class Hw7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int summ=0;
        int a = scanner.nextInt();
        while(a!=0){
            numbers.add(a);
            a = scanner.nextInt();
        }
        for(int i=0;i<numbers.size();i++){
            summ+=numbers.get(i);
        }
        System.out.println("Сумма чисел массива: "+summ);

    }
}
