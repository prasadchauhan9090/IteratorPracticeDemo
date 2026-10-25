package EnumarationPractice;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableUsingEnumaration {

    public static void main(String args[])
    {


        Hashtable<String, Integer> ages = new Hashtable<>();
        ages.put("INDIA", 500);
        ages.put("JAPAN", 400);
        ages.put("CHINA", 300);
        ages.put("AUSTRALIA", 200);
        ages.put("GERMANY", 100);

        Enumeration<Integer> em =  ages.elements();
        while(em.hasMoreElements())
        {
            System.out.print(em.nextElement()+"  ");
        }


    }
}
