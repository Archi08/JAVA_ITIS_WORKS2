// package task_26;

/**
 * Created by Аюпов Аяз on 05.04.2017.
 */
public class MainMyString {
    public static void main(String[] args) {
        char string[] = {'H','e','l','l','o',' ','w','o','r','d','!'};
       MyString str = new MyString(string);
       char str2[] = {'H','o','w',' ','a','r','e',' ','y','o','u','?'};
        MyString str3 = new MyString(str2);
        System.out.println(str.compareTo(str3));



    }
}
