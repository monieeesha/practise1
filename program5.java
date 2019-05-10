import java.util.*;
public class sum {
    public static void main(String[] args) {
         int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int x = s.nextInt();
        int a[]=new int[x];
        System.out.print("Enter the elements");
        for (int i=0;i < x; i++) {
            a[i] = s.nextInt();
           }
          for (int i=0;i < x; i++) {
              sum=sum+a[i];
            }
          System.out.println( sum);
    }
}
