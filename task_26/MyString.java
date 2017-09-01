


import JavaCore.stringSort.Interface.Comparable;

public class MyString  implements Comparable{

   private ArrayList<Character> myStr;

    public MyString(char array[]){
        myStr = new ArrayList<Character>();
        for(int i=0;i<array.length;i++){
            myStr.addToEnd(array[i]);
        }
    }
    public void print(){
        myStr.showArray();
    }
    public void concat(char array[]) {
        for(int i=0;i<array.length;i++) {
            myStr.addToEnd(array[i]);
        }
    }
    public ArrayList<Character> getMyString(){
        return myStr;
    }
    @Override
    public int compareTo(MyString that) {
        int thisLength =this.getMyString().getCount()-1;
        int thatLength =that.getMyString().getCount()-1;
        int min = Math.min(thisLength,thatLength);
        Object[] thisArray = this.getMyString().getArray();
        Object[] thatArray = that.getMyString().getArray();
        int k=0;
        while(k<min){
            char this_element = (char)thisArray[k];
            char that_element = (char)thatArray[k];
            if(this_element!=that_element){
                return this_element-that_element;
            }
            k++;
        }
        return thisLength-thatLength;

    }
}
