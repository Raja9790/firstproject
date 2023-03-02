/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raja;
import java.util.*;
public class reverse {
    public static void main(String[]args){
    Scanner s1=new Scanner(System.in);
System.out.println("enter a string");
String str=s1.nextLine();
String reverse="";
for(int i=str.length()-1;i>=0;i--)
        {
    reverse+=str.charAt(i);
    }
    System.out.println("reverse string="+reverse);
    }
}
