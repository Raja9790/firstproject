
package raja;
import java.util.*;
interface detail2{
    int n=112;
    int hs=200;
    int ef=300;
    int rf=300;
    String na="raja";
    void display();
    
}
 class student2 implements detail2{
     int t;
     public void display(){
         System.out.println("roll no of student="+n);
         System.out.println("name of student="+na);
         System.out.println("enter hf amount="+hs);
         System.out.println("enter the ef amount="+ef);
         System.out.println("enter the rf amount="+rf);
     t=hs+ef+rf;
     System.out.println("total amount="+t);
 }
 }
class diagram implements detail2{
    String pe="good";
    public void display(){
        System.out.println("perfomance of student="+pe);
    }
    public static void main(String[] args){
        student2 t=new student2();
        t.display();  
        diagram pe=new diagram();
        pe.display();
    }
    }

    
