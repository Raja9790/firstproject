
package raja;
import java.util.*;
public class check {
    public static void main(String[]args){
    String word="umbrella";
    char letter='e';
    boolean ispresent=false;
    for(int i=0;i<word.length(); i++)
    if(word.charAt(i)==letter){
        ispresent=true;
        break;
    }
    if(ispresent){
        System.out.println("letter is present in the word="+word);
    }
    else
    {
        System.out.println("letter is not present in the word="+word);
}
}
}
