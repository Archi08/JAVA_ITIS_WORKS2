
/**
 * 13) Попробовать реализовать через Кнута-Морриса-Пратта
 */
public class Hw13 {
    public static void main(String[] args) {
        char[] text = {'H','e','l','l','l','o'};
        char[] words = {'l','l','o'};
        int result = findWords(text,words);
        if(result!=-1){
            System.out.println("Схождение начинается с индекса - "+result);
        }else{
            System.out.println("Схождений нет");
        }

    }
    public static int findWords(char[] text, char[] words){
        int[] prefix = setIndexArrayText(words);  //{0,1,0}
        int k=0;
        int positionIndex=-1;
        for(int i=0;i<text.length;++i){
            while(words[k]!=text[i] && k>0){      //false; false; false; false; true;
                k = prefix[k-1];                  //1;
            }
            if(words[k] == text[i]){              //false; false; true; true; true; true;
                k ++;                             //1;2;2;3;
                if( k == words.length){           //false; false; false; true;
                    positionIndex= i+1-k;         //{3}  5+1-3=3
                }
            }else{
                k=0;
            }
        }
        return positionIndex;
    }
    public static int[] setIndexArrayText(char[] text){
        int[] prefix = new int[text.length];
        prefix[0]=0;
        for(int i =1;i<text.length;++i){
            int k = prefix[i-1];                  //0;1;2;
            while(text[k]!=text[i] && k>0){
                k = prefix[k-1];                 //false;false;0;
            }
            if(text[k]==text[i]){
                prefix[i] = k+1;                 //1;2;false
            }else{
                prefix[i] = 0;
            }
        }
        return prefix;
    }
}
