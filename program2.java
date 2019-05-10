import java.util.*;
public class evenodd{

    public static void main(String args[])
    {
        int n, m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        if((n%2!=0 )&&( n>20&&n<30))
        {
            System.out.println("Tom");

        }
        else if(n>20&&n<30)
            {


               System.out.println("Harry");
        }
    }
}
