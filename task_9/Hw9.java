
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Количество локальных максимумов a[i-1] <= a[i] > a[i+1]
 */
public class Hw9 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int countLocalMax=0;
        int a = scanner.nextInt();
        while(a!=0){
            number.add(a);
            a = scanner.nextInt();
        }
        for(int i=1;i<number.size()-1;i++){
            if(number.get(i-1)<=number.get(i)&& number.get(i)>number.get(i+1)){
                countLocalMax++;
            }
        }
        System.out.println("Количество локальных максимумов: "+countLocalMax);

    }
}
