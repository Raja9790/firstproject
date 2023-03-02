
package raja;
import java.util.*;
public class fop2 {
    int a[]=new int[5];
    int i,n,s=0;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value");
        for(i=0;i<5;i++)
            a[i]=s1.nextInt();
            System.out.println("view");
            for(i=0;i<5;i++)
            {
                s=s+a[i];
                System.out.println("sum="+s);
    }
    }
    public static void main(String args[])
    {
         fop2 r1=new fop2();
         r1.get();
    
    }
    
}
