package JavaProject2;

public class Task1 {



        public static void main(String args[])
        {
            String one = "Soleiman";
            String two = "Wafa";

            System.out.println("First: " +
                    one + " Second: "+two);

            one = one + two;

            two = one.substring(0,one.length()-two.length());

            one = one.substring(two.length());

            System.out.println("First: " +
                    one + " Second: " + two);
        }
    }

