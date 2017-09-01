package JavaCore.Models;

import JavaCore.Interfaces.Comparable;
import JavaCore.Interfaces.Figure;

/**
 * Created by tommy on 02.04.17.
 */
public class Triangle implements Figure,Comparable<Triangle> {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        try{
            if((a==0||b==0||c==0)||(a+b<c)||(b+c)<a||(c+a)<b)
                throw new ArithmeticException("Треугольник "+a+","+b+","+c+" не существует");
            else{
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public double getPerimetr() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        double p = getPerimetr()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "a -"+a+", b-"+b+", c-"+c;
    }

    @Override
    public int compareTo(Triangle that) {
        return (int)(this.getPerimetr()-that.getPerimetr());
    }
}
