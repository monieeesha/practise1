import java.util.*;
public class pattern {
    public static void main(String[] args) {

         Scanner s = new Scanner(System.in);
         int x = s.nextInt();
         for (int i = 1;i <= x; i++) {
                     int k = i;
            for (int n = 1; n <= k; n++) {
                System.out.print(k);
            }
        }
    }
}
