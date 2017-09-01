package ru.itis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        // количество потоков
        int threadsCount;
        // количество чисел
        int numbersCount;
        int[] numbers;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        List<MyThreads> threads = new ArrayList<>();
        System.out.println("Введите количество чисел:");
        numbersCount = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество потоков:");
        threadsCount = Integer.parseInt(reader.readLine());
        numbers = new int[numbersCount];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        int summ = 0;
        for(int i = 0; i < numbers.length; i++){
            summ += numbers[i];
        }

        // шаг:
        int t = numbersCount / threadsCount;
        // позиция в массиве
        int n = 0;
        int position = 0;
        for(int i = 0; i < threadsCount -1; i++){
            MyThreads newTreads = new MyThreads();
            int array[] = new int[t];
            for(int j = 0; j < t; j ++){
                array[j] = numbers[n++];
            }
            newTreads.init(array);
            threads.add(newTreads);

        }
        MyThreads lastTread = new MyThreads();
        int array[] = new int[numbers.length - n];
        for(int j = 0; j < array.length; j ++){
            array[j] = numbers[n++];
        }
        lastTread.init(array);
        threads.add(lastTread);
       for(MyThreads thread: threads){
           thread.start();
       }
        System.out.println("Сумма - "+ summ);

    }
}
