

/**
 * Created by Аюпов Аяз on 15.03.2017.
 */
public class ArrayList {
    /**
     * Возможности класса:
     * 1. Добавляет в начало
     * 2. Добавляет в конец
     * 3. Добавляет в произвольное место
     * 4. Удаляет первый элемент
     * 5. Удаляет последний элемент
     * 6. Удаляет в произвольном индексе
     * 7. Удаляет указанный элемент в массиве
     * 8. Переворачивает массив
     * 9. Показывает сколько элементов в массиве
     */
    private final int MAX_SIZE_ARRAY=10;
    private int[] array;
    private int count;

    public ArrayList(){
        count =0;
        array = new int[MAX_SIZE_ARRAY];
    }
    public void addToEnd(int elements){
       addToIndex(elements,count);
    }
    public void addToBegin(int elements){
        addToIndex(elements,0);
    }
    public void addToIndex(int element, int index) {
        if (count < MAX_SIZE_ARRAY) {

            for (int i = count; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
            count++;
        }else{
            System.out.println("Превышено допустимое значение длины массива");
        }
    }
    public void removeFirst(){
        removeByIndex(0);
    }
    public void removeLast(){
        count--;
    }
    public void removeByIndex(int index){
        for(int i = index;i<count-1;i++){
            array[i] = array[i+1];
        }
        count--;
    }
    public void remove(int element){
        boolean find = false;
        for(int i =0;i<count;i++){
            if(array[i]==element){
                removeByIndex(i);
               find = true;
            }
        }
        if(!find){
            System.out.println("Элемент "+element+" не найден в массиве");
        }
    }
    public void showArray(){
        System.out.print("[ ");
        for(int i=0;i<count;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    public int getCount(){
        return count;
    }
    public void reverse(){
        for(int i =0;i<count/2;i++){
            int tmp = array[i];
            array[i] = array[count-i-1];
            array[count-i-1] = tmp;
        }
    }

}
