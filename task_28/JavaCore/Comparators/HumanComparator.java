package JavaCore.Comparators;

import JavaCore.Interfaces.Comparator;
import JavaCore.Models.Humans;

/**
 * Created by tommy on 02.04.17.
 */
public class HumanComparator implements Comparator<Humans> {

    @Override
    public int compare(Humans a, Humans b) {
        return a.getId()-b.getId();
    }

    public static void sortById(Humans humans[]){
        for(int i =0;i<humans.length;i++){
            for(int j=i+1;j<humans.length;j++){
                if(humans[i].getId() - humans[j].getId()>0){
                    Humans tmp = humans[i];
                    humans[i] = humans[j];
                    humans[j] = tmp;
                }
            }
        }
    }
}
