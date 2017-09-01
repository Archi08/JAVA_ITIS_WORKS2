package JavaCore.Comparators;

import JavaCore.Interfaces.Comparator;
import JavaCore.Models.Triangle;

/**
 * Created by tommy on 02.04.17.
 */
public class TrianglePerimetrComparator implements Comparator<Triangle> {

    @Override
    public int compare(Triangle a, Triangle b) {
        return (int)(a.getPerimetr()-b.getPerimetr());
    }
}
