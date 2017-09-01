package ru.itis;

/**
 * 31.05.2017
 * MyThreads
 *
 * @author Ayupov Ayaz (First Software Engineering Platform)
 * @version v1.0
 */
public class MyThreads extends Thread {


    private static int summ;
    private int[] sector;

    static{
        summ = 0;
    }

    public void init(int[] sector){
        this.sector = sector;
    }
    @Override
    public void run() {
        for(int i = 0; i < sector.length; i++){
            summ += sector[i];
            System.out.println(Thread.currentThread()+" - - - "+ summ);
        }
    }

}
