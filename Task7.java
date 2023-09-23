package JavaProject2;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Banana");
        words.add("Berry");
        words.add("Apple");
        words.add("Kiwi");
        words.add("Orange");
        words.add("Cherry");
        for(String str:words){
            if(str.startsWith("a")||str.startsWith("A")){
                System.out.println(str.toLowerCase());
            }
        }
    }

}




