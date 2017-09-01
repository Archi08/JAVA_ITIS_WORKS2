package BucketSort;
import java.util.Random;
/**
 * Created by tommy on 11.04.17.
 */
public class BucketSortMain {
    public static void main(String[] args) {
        BucketSort.LinkedList<Human> list[] = new BucketSort.LinkedList[120];

        Random random = new Random();
        for(int i=0;i<list.length;i++){
            list[i] = new BucketSort.LinkedList<>();
        }
        for(int i =0;i<list.length;i++){
            int r = random.nextInt(120);
            Human human = new Human("h"+(i+1),random.nextInt(30)+1,random.nextInt(11)+1,
                    r+1897);
            list[r].addToTell(human);
        }
        for(int i =1;i<list.length;i++){
            try{
                if(list[i].getHead()!=null){
                    list[0].addList(list[i]);
                }
            }catch(NullPointerException e){}

        }
        list[0].showList();


    }

}
