/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raja;
import java.util.*;
public class Raja {
    int a,b,c;
    void get()

    {
        System.out.println("enter the value");
        Scanner s1=new Scanner(System.in);
        a=s1.nextInt();
        b=s1.nextInt();
        c=a+b;
        System.out.println("sum="+c);
    }
    public static void main(String[] args) {
     Raja r1=new Raja();
     r1.get();
     
    }
    
}
