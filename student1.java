
package raja;
import java.util.*;
interface moveable
{
    int avgspeed=40;
    void move();
}
class vehicle implements moveable {
public void move()
{
    System.out.println("average speed is :"+avgspeed);
}
public static void main(String args[]){
vehicle vc=new vehicle();
vc.move();
}
}
