import java.util.*;

public class  ul {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
          char ch=s.next().charAt(0);

                if (ch >='A' && ch<='Z') {

                    System.out.println("Capital");
                }

                else if ((ch >= 'a' && ch <= 'z')) {
                    System.out.println(" small");

                }
                else
                    {

                    System.out.println( "not a character");
                   }

            }

        }



