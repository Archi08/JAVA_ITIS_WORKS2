package HomeWork;

/**
 * Created by tommy on 01.03.17.
 */
public class Hw12 {
    public static void main(String[] args) {
        char[] text = {'H','e','l','l','l','o'};
        char[] word = {'l','l','o'};
        int count =0;
        int position=-1;
        for(int i =0;i<word.length;){
            for(int j=0;j<text.length;j++){
                if(word[i]==text[j]){
                    count++;
                    i++;
                    if(position==-1){
                        position=j;
                    }
                }else{
                    j -=count;
                    count =0;
                    i = 0;
                    position = -1;
                }
            }
        }
        if(position!=-1) {
            System.out.println(position);
        }else{
            System.out.println("Совпадений нет");
        }
            }
}
