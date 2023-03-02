
package raja;
import java.util.*;
public class fruit {
    int a=40,m=60;
    void display()
    {
        System.out.println("this is the method to calculate fruits");
        System.out.println("no.of.apples="+a);
        System.out.println("no.of.mangoes="+m);
    }
}
class total extends fruit
{
    int z;
    void add()
    {
        display();
        z=a+m;
        System.out.println("total no of frits in basket="+z);             
}
public static void main(String args[])
{
    total f1=new total();
  
    f1.add();
}
}