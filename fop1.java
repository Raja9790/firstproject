/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raja;
import java.util.*;
public class fop1 {
    int n;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the value");
        n=5;
        while(n>=1)
        { 
            System.out.println("decrement="+n);
            n--;
        }
        }
    public static void main(String args[])
    {
        fop1 r1=new fop1();
        r1.get();
    }
}
