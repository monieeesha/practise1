import java.util.*;
public class count {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.next();
        int n=s.nextInt();
        String app="";
        String org="";
        int h=x.length()-1;
        for(int i=1;i<=n;i++)
         {
             app=app+x.charAt(h);
             h--;
         }

        for (int i = app.length()-1; i >= 0; i--)
        {
            org= org+ app.charAt(i);
        }

        for(int k=0;k<n;k++)
        {
            x=x+org;

        }
        System.out.print(x);
        }
    }