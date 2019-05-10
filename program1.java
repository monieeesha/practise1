import java.util.*;
public class palindrome {

    public static void main(String args[])
    {
        int n, m,a = 0,sum=0,x,rem,c=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        m = n;
        while(n != 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        if(a == m)
        {

             c=m;
            while(m != 0) {
                  int digit = m % 10;
                  m = m / 10;
                  rem = digit % 2;
                   if(rem==0) {
                     sum = sum + digit;
                 }
                 }



                if(sum>25)
                {

                    System.out.println("Given number "+c+" is Palindrome  and grater than 25");

                }

        }
        else
        {
            System.out.println("Given number "+c+" is Not Palindrome");
        }
    }
}
