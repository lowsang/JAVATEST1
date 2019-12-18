package test.test;

import org.testng.annotations.Test;

import java.util.*;

public class TestList {
    @Test
    public void testlist() {
        Collection c=new ArrayList();
        c.add("cc");
        c.add("dd");
        List list=new ArrayList(c);
        System.out.println(list.size());
        list.add("cat");
        list.add("dog");
        list.add("pig");
        list.add("pig");
        list.add("fuck");
        list.add("pig");
        System.out.println(list.size());
        System.out.println(list);
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println(list.set(1,"mouse"));
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf("pig"));
        System.out.println(list.lastIndexOf("pig"));
        List ll= list.subList(1,4);
        System.out.println(ll);

    }

    @Test
    public void testlinklist() {
        Collection c=new ArrayList();
        c.add("cc");
        c.add("dd");
        LinkedList list=new LinkedList(c);
        System.out.println(list.size());
        list.add("cat");
        list.add("dog");
        list.add("pig");
        list.add("pig");
        list.add("fuck");
        list.add("pig");
        System.out.println(list);
        list.addFirst("lulu");
        list.addLast("bubu");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

    }
}
