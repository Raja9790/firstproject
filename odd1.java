
package raja;
import java.util.*;
public class odd1 {
    int a,i,s=0;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value");
        i=1;
        while(i<=a)
        {
          a=s1.nextInt();
            s=i*i;
        System.out.println("answer="+s);
        i++;
    }
}
    public static void main(String args[])
    {
        odd1 s1=new odd1();
        s1.get();
    }
}
