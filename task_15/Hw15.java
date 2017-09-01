
/**
 * 15) Написать фукнцию, решающую квадратное уравнение. Она должна возвращать массив корней
 2. процедуры
 */
public class Hw15 {
    public static void main(String[] args) {
        int a=2, b=7, c=4;
        quadraticEqualation(a,b,c);
    }

    public static double discriminant(int a, int b, int c){
        int D = b*b-4*a*c;
        return D;
    }
    public static void quadraticEqualation(int a,int b, int c){
        if(a!=0){
        double result[];
        double D = discriminant(a,b,c);

        if(D<0){
            System.out.println("Уравнение не имеет корней! ");
        }else if(D==0){
            result=new double[1];
            result[0]= -b/2*a;
            System.out.println("x равен -"+result[0]);
        }else{
            result = new double[2];
            result[0]=(-b+Math.sqrt(D))/(2*a);
            result[1]=(-b-Math.sqrt(D))/(2*a);
            System.out.println("Первый  х = "+result[0]);
            System.out.println("Второй  х = "+result[1]);
        }
        }else{
            System.out.println("коэффициент 'a' не может быть равен - 0 !!!!");
        }
    }
}
