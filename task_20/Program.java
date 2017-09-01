
import java.util.Random;

/**
 *20) Сортировать людей по возрасту используя ООП (методом пузырька) - задать массив из 15 человек.
 by tommy on 10.03.17.
 */
public class Program {
    public static void main(String[] args) {
        Human[] humans = new Human[15];
        Random random = new Random();
        for(int i=0;i<humans.length;i++){
            int age = random.nextInt(100);
            humans[i] = new Human("human_"+(i+1),age);
        }
        for(int i =humans.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(humans[j].getAge() > humans[j+1].getAge()){
                    Human tmp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = tmp;
                }
            }
        }
        for(int i =0;i<humans.length;i++){
            System.out.println(humans[i].toString());
        }

    }
}
