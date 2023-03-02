/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raja;
import java.util.*;
public class student {
    int rollno,total=0,subject;
    String name;
    int marks[];
    
        Scanner sc=new Scanner(System.in);
        {
        System.out.println("enter roll no:");
        rollno=sc.nextInt();
        System.out.println("enter student name:");
        name=sc.next();;
        getDisMarks();
    }
    public void getDisMarks()
    {
        marks =new int[3];
        System.out.print("enter mark of physics");
        marks[0]=sc.nextInt();
        System.out.print("enetr mark of chemistry");
        marks[1]=sc.nextInt();
        System.out.print("enter mark of maths");
        marks[2]=sc.nextInt();
        for(int i=0;i<3;i++)
        {
            total+=marks[i];
        }
        System.out.println("total mark of student="+total);
    }
         public static void main(String args[]){
student s[]=new student[2];
for(int i=0;i<2;i++)
    s[i]=new student();
         }
}
        
   
