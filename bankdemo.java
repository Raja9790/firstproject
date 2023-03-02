
package raja;
import java.io.*;
import java.util.*;
public class bankdemo 
{
    public static void main(String[]args)
    {
        CheckingAccount c=new CheckingAccount(101);
        System.out.println("depositing $500...");
        c.deposit(500.00);
    
        System.out.println("\n withdrawing $100...");
        c.withdraw(100.00);
        System.out.println("\n withdrawing $600..");
        c.withdraw(600.00);
    }
}
    