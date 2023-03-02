
package raja;
import java.util.*;
public class fop4 {
    int a[]=new int[6];
    int i,x=0,y=0,m=0,n=0,z=0;
            
    void get()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value");
        for(i=0;i<6;i++)
            a[i]=s1.nextInt();
    
        System.out.println("view");
        for(i=0;i<6;i++)
        {
            if(a[i]%2==0)
                x++;
        else
                y++;
        if(a[i]>0)
            m++;
        else
            n++;
        if(a[i]==0)
            z++;
        }
        System.out.println("\neven="+x);
        System.out.println("\nodd="+y);
        System.out.println("\npostive="+m);
        System.out.println("\nnegative="+n);
        System.out.println("\nzero="+z);
    }
    public static void main(String args[])
    {
        fop4 r1=new fop4();
        r1.get();
    }
}
            
            
            
            
        
    
    

