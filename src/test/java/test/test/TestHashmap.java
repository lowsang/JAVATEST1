package test.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.Test;

import java.util.*;

public class TestHashmap {
    @Test
    public void testHashmap() {
        HashMap h=new HashMap();
        Map m=new HashMap();
        m.put(005,333);
        m.put(006,'g');
        h.put(001,null);
        h.put(002,"cat");
        h.put(003,"pig");
        h.put("dsfsd",'j');
        System.out.println(h.put(001,"fuck"));
        System.out.println(h.size());
        h.putAll(m);
        System.out.println(h.size());
        System.out.println(h);
        h.remove(001);
        System.out.println(h);
        System.out.println(h.get(001));
        Set s=h.keySet();
        System.out.println(s);
//        Iterator iterator=s.iterator();
//        while(iterator.hasNext()){
//            Object key= iterator.next();
//            System.out.println(h.get(key));
//            System.out.println(h.get(key).hashCode());
//        }
        Double d=new Double(33.3);
        System.out.println(d.doubleValue());
//        Set s1=h.entrySet();
//        System.out.println(s1);
//        iterator=s1.iterator();
//        while(iterator.hasNext()) {
//
//            System.out.println(iterator.next());
//            //System.out.println(iterator.next().hashCode());
//        }
    }
}
