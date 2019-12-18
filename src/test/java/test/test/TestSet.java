package test.test;

import org.testng.annotations.Test;

import java.util.*;

public class TestSet {
    @Test
    public void testset() {
        Set h=new HashSet();
        h.add("dog");
        h.add("cat");
        h.add("pig");
        System.out.println(h.size());
        h.add("pig");
        System.out.println(h.size());
        System.out.println(h);
        System.out.println(h.hashCode());
        System.out.println("========================");
        Iterator i=h.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
            //System.out.println(i.next().hashCode());
        }
    }

    @Test
    public void testtreeset() {
        String j="dd";
        TreeSet tt=new TreeSet();
        tt.add(55);
        tt.add(32);
        tt.add(13);
        tt.add(67);
        tt.add(5);
        System.out.println(tt.size());
        tt.add(55);
        System.out.println(tt.size());
        System.out.println(tt);
//        Iterator ii=tt.iterator();
//        while(ii.hasNext()){
//            System.out.print(ii.next()+" ");
//        }
//        System.out.println();
        System.out.println(tt.first());
        System.out.println(tt.last());
//        tt.pollFirst();
//        System.out.println(tt);
//        tt.pollLast();
//        System.out.println(tt);
        SortedSet ff=tt.subSet(5,32);
        System.out.println(ff);
        ff=tt.tailSet(32);
        System.out.println(ff);
        ff=tt.headSet(55);
        System.out.println(ff);



    }
}
