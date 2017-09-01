package DAO;

public class ArrayList<V> {

    private final int MAX_SIZE_ARRAY=10;
    private Object array[];
    private int count;

    public ArrayList(){
        count =0;
        array = new Object[MAX_SIZE_ARRAY];
    }
    public void addToEnd(V elements){

        addToIndex(elements,count);
    }
    public void addToBegin(V elements){
        addToIndex(elements,0);
    }
    public void addToIndex(V element, int index) {
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
    public void remove(V element){
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
        System.out.print("ArrayList [ \n");
        for(int i=0;i<count;i++){
            System.out.print(array[i]+"\n");
        }
        System.out.print("]");
        System.out.println();
    }
    public boolean doesAnElementExist(V element){
        for(int i=0;i<array.length;i++){
            if(array[i] == element){
                return true;
            }
        }
        return false;
    }
    public int getCount(){
        return count;
    }
    public V getElementById(int i){
        return (V)array[i];
    }
//    public void reverse(){
//        for(int i =0;i<count/2;i++){
//            int tmp = array[i];
//            array[i] = array[count-i-1];
//            array[count-i-1] = tmp;
//        }
//    }

}
