package org.example;

import java.sql.SQLOutput;
import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 3, 4, 3, 444, 3, 2, 2, 2, 2));
        System.out.println(ar);

        //To remove the dulplicates integers
        LinkedHashSet<Integer> dupRemoved = new LinkedHashSet<Integer>(ar);
        System.out.println(dupRemoved);

        //To remove the dulplicates integers

        ArrayList<String> words = new ArrayList<String>(Arrays.asList("kee", "wee", "kee", "dee"));
        System.out.println(words);

        LinkedHashSet<String> dupsRemWords = new LinkedHashSet<String>(words);
        System.out.println(dupsRemWords);


        ArrayList<Object> arq = new ArrayList<Object>(Arrays.asList("22", 32, "22", 32, 1, 2));
        LinkedHashSet<Object> lkd = new LinkedHashSet<Object>(arq);
        System.out.println(arq);
        System.out.println(lkd);

        //map object    (no order for map)
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("name", "keerthi");
        hm.put("class", "year 5");
        System.out.println(hm);
        System.out.println(hm.containsKey("name"));
        System.out.println(hm.get("name"));
        System.out.println(hm.isEmpty());
        System.out.println(hm.size());
        System.out.println(hm.clone());

        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("name", "keerthi");
        hm1.put("class", "year 5");
        System.out.println(hm.equals(hm1));
//vector and enumerator cursor
        Vector v = new Vector();
        Enumeration e = v.elements();
        for (int i = 0; i <= 10; i++) {
            v.add(i);
        }
        v.add(1);
        v.add(6);

        while (e.hasMoreElements()) {
            Integer i = (Integer) e.nextElement();
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println(e);
        e.hasMoreElements();

// Iterator cursor
        ArrayList<Object> arrl=new ArrayList<Object>(Arrays.asList(1,2,3,4,5,6,7,5,6,7));
        Iterator<Object> itr= arrl.iterator();
while(itr.hasNext()){
    Integer x=  (Integer) itr.next();
    System.out.println("iteraror  = "+ x);
}
    }
}
