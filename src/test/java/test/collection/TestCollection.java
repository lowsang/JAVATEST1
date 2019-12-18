package test.collection;

import org.testng.annotations.Test;
import sun.jvm.hotspot.opto.Compile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollection {
    @Test
    public void testCollection() {
        Collection<String> c=new  ArrayList();
        c.add("aa");
        c.add("bb");
        c.add("cc");
        Collection d=new ArrayList();
        d.add("cc");
        d.add("dd");
//        System.out.println(c.retainAll(d));
//        System.out.println(c);
        c.addAll(d);
        System.out.println(c.size());
        Object[] str=  c.toArray();
        System.out.println(Arrays.toString(str));
        for(Object s:str){
            System.out.println(s);
        }
       Arrays.asList(str).forEach(System.out::println);
    }
}
