import java.util.*;
public class sort {

    public static void main(String[] args) {
        int n, temp,k=0,m,i=0,d,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        n = s.nextInt();
        m=n;
        while(n!=0)
        {
            n=n/10;
            k++;


        }

        int a[] = new int[k];
        while(m!=0)
        {

            a[i++]=m%10;
            m=m/10;



        }
        for (int y = 0; y < k; y++) {
            for (int j = y + 1; j < k; j++) {
                if (a[y] <a[j]) {

                    temp = a[y];
                    a[y] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int y = 0; y < k; y++) {
            System.out.print(a[y]);
        }

        for(int p=0;p<k;p++)
        {
            if(a[p]%2==0)
            {
                sum=sum+a[p];
            }


        }

        if(sum>15) {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }




    }
}
