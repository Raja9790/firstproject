/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classteaching;

/**
 *
 * @author Administrator
 */
class Marks {

    String name;
    int rollno;
    int mathsmark, phymark, chemimark=90;
}

class Maths extends Marks {
//    int mathsmark;

    int m1(int maths) {
        mathsmark = maths;
        return mathsmark;
    }
}

class Physics extends Marks {

    int m1(int physics) {
        phymark = physics;
        return phymark;
    }
}

class Chemistry extends Marks {

    int m1() {
       
        return chemimark;
    }
}

public class NewClass {

    public static void main(String[] args) {
        Maths m = new Maths();
        int mark1 = m.m1(56);
        Physics p = new Physics();
        int mark2 = p.m1(67);
        Chemistry c = new Chemistry();
        int mark3 = c.m1();
        int Total=mark1+mark2+mark3;
        float average=Total/3;
        System.out.println("Total:"+Total+"\nAverage:"+average);

    }
}
