
package raja;
import java.util.*;
public class fop5 {
    int a[][]=new int[3][3];
    int i,j;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=s1.nextInt();
            }
        }
        System.out.println("view");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
            System.out.print("\n");
        }
    }
        public static void main(String args[])
        {
                fop5 r1=new fop5();
                r1.get();
        }
}
                        
    

