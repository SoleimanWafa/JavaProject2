package JavaProject2;

public class Task3 {

        String palindrome(String word) {
            String pal = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                pal = pal + word.charAt(i);
            }
            if (word.equals(pal)) {
                return "Palindrome";

            } else {
                return "Not a palindrome";
            }
        }

        public static void main(String[] args) {
            Task3 pali=new Task3();
            System.out.println(pali.palindrome("kayak"));
        }
    }
