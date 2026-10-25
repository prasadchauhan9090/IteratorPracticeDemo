package EnumarationPractice;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationUsingVector {


    public static void main(String args[])
    {

        Vector<String> v = new Vector<>();
        v.add("BANANA");
        v.add("APPLE");
        v.add("MANGO");
        v.add("CHERRY");
        v.add("GRAPS");
        v.add("BANANA");
        v.add("APPLE");
        v.add("MANGO");
        v.add("CHERRY");
        v.add("GRAPS");


        Enumeration e = v.elements();

        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+"  ");
        }



    }
}
