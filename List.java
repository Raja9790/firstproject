/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[]=new int[50];
        int n;
        System.out.println("enter size");
        Scanner s1=new Scanner(System.in);
        n=s1.nextInt();
         System.out.println("enter value");
        for(int i=0;i<n;i++)
            a[i]=s1.nextInt();
         System.out.println("enter the search element");
         int x=s1.nextInt();
         for(int i=0;i<n;i++)
             if(x==a[i])
                 System.out.println("present");
              
         
    }
    
}
