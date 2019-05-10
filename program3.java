import java.util.*;
public class  vdc {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.next();
        line = line.toLowerCase();
        if (line.length() > 1) {

            for (int i = 0; i < line.length(); ++i) {

                char ch = line.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch+"  vowel");
                } else if ((ch >= 'a' && ch <= 'z')) {

                    System.out.println(ch+" consonants");

                } else  {

                    System.out.println( " is  not a letter");
                }

              }

           }

        }

    }