import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * 30.05.2017
 *
 * @author Shaikhutdinov Artur (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String args[]) {




        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        int a = 0;
        for (int anArr : arr) {
            a = a + anArr;
        }
        System.out.println(a);

        Scanner scanner = new Scanner(System.in);

        // считали количество потоков
        int threadsCount = scanner.nextInt();


        // создали массив для хранения результатов
        // i-ый поток хранит свою сумму в results[i]
        int results[] = new int[threadsCount];

        // создали массив потоков
        MyThread threads[] = new MyThread[threadsCount];

        // задали для каждого потока его границы подсчета
        for (int i = 0; i < threadsCount; i++) {
            int start = i * (100 / threadsCount);
            int end = start + 100 / threadsCount;
            threads[i] = new MyThread(start,end,arr,results,i);
        }
        int lastThreadIndex = threadsCount - 1;
        // для последнего потока указали границу до конца массива
        threads[lastThreadIndex] = new MyThread(lastThreadIndex * (100 / threadsCount), arr.length, arr, results, lastThreadIndex);

        // запустили все потоки, усыпив главный поток
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }
        }
        // вывели список результатов
        int result = 0;
		for (int i = 0; i < results.length; i++) {
			result = results[i] + result;
		}
        System.out.println(result);





    }
}
