package JavaCore;

import JavaCore.Comparators.HumanComparator;
import JavaCore.Models.Humans;
import JavaCore.Models.Students;
import JavaCore.Models.Triangle;

/**
 * Created by tommy on 02.04.17.
 */
public class MainJavaCore {

    public static void main(String[] args) {
        Humans human1 = new Humans(6,"Аяз",25);
        Humans human2 = new Humans(8,"Рома",23);
        Humans human3 = new Humans(13,"Вася",20);
        Humans human4 = new Humans(7,"Коля",19);
        Humans human5 = new Humans(4,"Сирин",30);
        Humans human6 = new Humans(34,"Лева",27);
        Humans humans[] = {human1,human2,human3,human4,human5,human6};
        HumanComparator.sortById(humans);
        for(int i =0;i<humans.length;i++){
            System.out.println(humans[i]);
        }

        Triangle tr = new Triangle(3,5,6);
        Triangle tr2 = new Triangle(2,4,3);
        Triangle tr3 = new Triangle(4,7,3);
        Triangle tr4 = new Triangle(2,5,3);
        Triangle triangles[] = {tr,tr2,tr3,tr4};
        Triangle minTr = triangles[0];
        for(int i=1;i<triangles.length;i++){
            if(minTr.compareTo(triangles[i])>0){
                minTr = triangles[i];
            }
        }
        System.out.println(minTr);
        Humans newHuman = Collections.findMin(humans);
        System.out.println(newHuman);
        System.out.println();
        Students students[] ={new Students(human1,523),
                                new Students(human2,424),
                                    new Students(human1,225)};
        Students minStudent = Collections.findMin(students,null);
        System.out.println(minStudent);

    }

}
