package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.SortedMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,4,3,444,3,2,2,2,2));
        System.out.println( ar );

        //To remove the dulplicates integers
        LinkedHashSet<Integer> dupRemoved=new LinkedHashSet<Integer>(ar);
        System.out.println(dupRemoved);

        //To remove the dulplicates integers

        ArrayList<String > words=new ArrayList<String>(Arrays.asList("kee","wee","kee","dee"));
        System.out.println(words);

        LinkedHashSet<String> dupsRemWords=new LinkedHashSet<String>(words);
        System.out.println(dupsRemWords);

    }
}
