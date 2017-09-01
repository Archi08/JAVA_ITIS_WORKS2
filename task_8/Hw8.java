

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 8) Сумма элементов, стоящих на нечетных позициях
 */
public class Hw8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int summ=0;
        int a =scanner.nextInt();
        while(a!=0){
            numbers.add(a);
            a = scanner.nextInt();
        }
        for(int i=0;i<numbers.size();i++){
            if(i%2!=0 && i!=0){
                summ+=numbers.get(i);
            }
        }
        System.out.println("Сумма элементов, стоящих на нечетных позициях равна -"+summ);
    }
}
