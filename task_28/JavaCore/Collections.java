package JavaCore;

import JavaCore.Interfaces.Comparator;
import JavaCore.Interfaces.Comparable;

public class Collections {
    public static <V> V findMin(Comparable<V> objects[]){
        return findMin((V[])objects,null);
    }

    public static <V> V findMin(V objects[], Comparator<V> comparator){
        V minObject = objects[0];
        for(int i =1;i<objects.length;i++){
            int compareResult;
            if(comparator!=null){
                compareResult = comparator.compare(minObject,objects[i]);
            }else{
                compareResult = ((Comparable<V>)objects[i]).compareTo(minObject);
            }
            if(compareResult<0){
                minObject = objects[i];
            }
        }
        return minObject;
    }
}
