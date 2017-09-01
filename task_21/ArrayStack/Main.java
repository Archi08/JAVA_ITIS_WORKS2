
/**
 * Created by Аюпов Аяз on 15.03.2017.
 */
public class Main {
    public static void main(String[] args) {
      ArrayStack arrayStack = new ArrayStack();
        arrayStack.push('[');
        arrayStack.push('{');
        arrayStack.push('(');
        arrayStack.push('ф');
        arrayStack.push(')');
        arrayStack.push('}');
        arrayStack.push(']');
        arrayStack.push('[');
        arrayStack.push(']');
        arrayStack.bracketSequence();


    }
}
