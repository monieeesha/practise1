import java.util.*;
public class guess {

    public static void main(String[] args) {
        int a=45;
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the number between 1 to 50: ");
            int x = s.nextInt();



            if (a == x) {

                System.out.println("matched");
                break;
            }


            else if (x < a) {

                System.out.println("number is less than guessed");
                continue;
            }


            else if (x >a) {
                System.out.println("number is less than guessed");
                continue;

            }



        }

    }



}
