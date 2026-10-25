package IteratorPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPracticeDemo {


    public static void main(String args[])
    {

        //Iterator  - is an interface
        //introduced for iterating the all  collection objects
        //legacy v1 + new version v2
        //one direction , readonly with special permition to removing the elements

        ArrayList<Integer> al = new ArrayList<>();

        al.add(14);
        al.add(26);
        al.add(33);

        Iterator<Integer> i =  al.iterator();

        //iterators has two main methods
        // i.hashnext --> check the next elements there or not there
        //i.next() --> removes the elements

        while(i.hasNext())
        {
            System.out.println(i.next());
        }



    }
}
