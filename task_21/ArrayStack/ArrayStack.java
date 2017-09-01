
/**
 * стэк - последний пришел, первый вышел
 * push - ложит в конец
 * pop - забирает с конца
 * peek - посмотреть на последний элемент который положили
 *bracketSequence - проверяет последовательность скобок
 */
public class ArrayStack {
    private final int MAX_ARRAY_SIZE = 10;
    private char[] elements;
    private char[] stackBrackets;
    private int count;
    private int stackCount;

    public ArrayStack(){
        elements = new char[MAX_ARRAY_SIZE];
        count = 0;
    }
    public void push(char element){
        if(count-1<MAX_ARRAY_SIZE){
        elements[count] = element;
        count++;}else{
            System.out.println("array is full");
        }
    }
    public char pop(){
        count--;
        return elements[count];
    }
    public char peek(){
        return elements[count-1];
    }
    private void pushSequence(char bracket){
            stackBrackets[stackCount] = bracket;
            stackCount++;
    }
    private char peekSequence(){
        return stackBrackets[stackCount-1];
    }
    private void popSequence(){
        stackCount--;
    }
    public void bracketSequence(){
        stackCount = 0;
        stackBrackets = new char[MAX_ARRAY_SIZE];
        for(int i =0;i<count;i++){
            if(elements[i]=='{' || elements[i]=='[' || elements[i]=='('){
                pushSequence(elements[i]);
            }else if(elements[i]=='}' || elements[i]==']' || elements[i]==')'){
                char lastBracket = peekSequence();
                if(elements[i]=='}' && lastBracket=='{'){
                    popSequence();
                }else if(elements[i]==']' && lastBracket=='['){
                    popSequence();
                }else if(elements[i]==')' && lastBracket=='('){
                    popSequence();
                }
            }
        }
        if(stackCount==0){
            System.out.println("Последовательность правильная");
        }else{
            System.out.println("Последовательность нарушена");
        }
    }
    public void showArray(){
        System.out.print("[ ");
        for(int i =0;i<count;i++){
            System.out.print(elements[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }





}
