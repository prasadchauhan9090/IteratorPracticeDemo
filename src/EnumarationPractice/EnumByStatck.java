package EnumarationPractice;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumByStatck {

    public static void main(String args[]) {

        Stack<String> v = new Stack<>();
        v.add("STACKSSSSS");
        v.add("APPLESSSSSSSSS");
        v.add("MANGO");
        v.add("CHERRY");
        v.add("GRAPS");
        v.add("BANANA");
        v.add("APPLE");
        v.add("MANGO");
        v.add("CHERRY");
        v.add("GRAPS");


        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + "  ");
        }


    }
}
