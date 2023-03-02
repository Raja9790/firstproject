
package raja;
import java.util.*;
public class exceptest {
    public static void main(String args[]){
        try{
        int a[]=new int[3];
        System.out.println("access element three:"+a[3]);   
      }  
    catch(ArrayIndexOutOfBoundsException e){
    System.out.println("exception thrown:"+e);
}
    System.out.println("out of the block");
    }
}
    

