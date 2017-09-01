/**
 * 19) попробовать написать оптимальный вариант фибонначи
 */
public class Fibonachi {
    public static void main(String[] args) {
        int a = 7;
        System.out.println(fib(a));
    }
    public static int fib(int a ){
        int[] f_arr = new int[a+1];
        if(a==0){
            f_arr[0] = 1;
        }
        if(a==1){f_arr[0]=1;f_arr[1]=1;}
        else if(a>1){
            f_arr[0] = 1;
            f_arr[1] = 1;
            for(int i =2;i<a+1;i++){
                f_arr[i] = f_arr[i-1]+f_arr[i-2];
            }
        }
        return f_arr[a];


    }
}
