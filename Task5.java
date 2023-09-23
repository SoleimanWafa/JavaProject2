package JavaProject2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

            String str1 = "Lived";
            String str2 = "Devil";

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            if(str1.length() == str2.length()) {

                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();

                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                boolean a = Arrays.equals(charArray1, charArray2);

                if(a) {
                    System.out.println(str1 + " and " + str2 + " are an anagram.");
                }
                else {
                    System.out.println(str1 + " and " + str2 + " are not an anagram.");
                }
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not an anagram.");
            }
        }
    }