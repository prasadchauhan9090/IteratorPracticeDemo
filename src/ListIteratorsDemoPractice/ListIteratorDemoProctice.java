package ListIteratorsDemoPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemoProctice {


    public static void main(String args[])
    {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        ListIterator<Integer> li = al.listIterator();

        //forward Deirection
        while(li.hasNext())
        {
            System.out.println(li.next());
        }

        System.out.println("Backeword direction/previous direction below is backword direction");
        //Backeword direction/previous direction
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }



    }
}
