import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.next();
        String rev = "";
        for (int i = x.length()-1; i >= 0; i--)
        {
            rev = rev + x.charAt(i);
        }

        System.out.println(rev);

    }
}
