//package test.test;
//
//import org.testng.annotations.Test;
//
//import java.util.*;
//
//public class Testcollection {
//    @Test
//    public void testcollection() {
//        Collection c=new ArrayList();
//        c.add("apple");
//        c.add("banana");
//        c.add("apple");
//        c.add("pear");
//        c.add('s');
//        ArrayList array=new ArrayList();
//        array.add("cat");
//        array.add("dog");
//        array.add("apple");
//        System.out.println(c.size());
//        if(!array.isEmpty()) {
//            c.addAll(array);
//        }
//        System.out.println(c.size());
//        System.out.println(c);
//        System.out.println("===================================");
//        Iterator iterator1=c.iterator();
//        while(iterator1.hasNext()){
//            System.out.print(iterator1.next()+" ");
//        }
//        System.out.println();
//        if(c.contains("cat")){
//            c.remove("cat");
//        }
//        System.out.println(c+"[]");
//        c.removeAll(array);
//        //Arrays.asList(c).forEach(System.out::println);
//        System.out.println(c+"....");
//        System.out.println("===========================");
//        Object[] str=c.toArray();
//        for(Object st:str){
//            System.out.println(((Object)st);
//        }
//        System.out.println("===========================");
//        String s="";
//        for(int i=0;i<str.length;i++){
//            s=(String)str[i];
//            System.out.println(s);}
//
//            Collection cc=new Collection() {
//                @Override
//                public int size() {
//                    return 0;
//                }
//
//                @Override
//                public boolean isEmpty() {
//                    return false;
//                }
//
//                @Override
//                public boolean contains(Object o) {
//                    return false;
//                }
//
//                @Override
//                public Iterator iterator() {
//                    return null;
//                }
//
//                @Override
//                public Object[] toArray() {
//                    return new Object[0];
//                }
//
//                @Override
//                public Object[] toArray(Object[] a) {
//                    return new Object[0];
//                }
//
//                @Override
//                public boolean add(Object o) {
//                    return false;
//                }
//
//                @Override
//                public boolean remove(Object o) {
//                    return false;
//                }
//
//                @Override
//                public boolean containsAll(Collection c) {
//                    return false;
//                }
//
//                @Override
//                public boolean addAll(Collection c) {
//                    return false;
//                }
//
//                @Override
//                public boolean removeAll(Collection c) {
//                    return false;
//                }
//
//                @Override
//                public boolean retainAll(Collection c) {
//                    return false;
//                }
//
//                @Override
//                public void clear() {
//
//                }
//            };
//            cc.add("cccc");
//            cc.add("popop");
//            System.out.println(cc);
//            Iterator iterator3=cc.iterator();
//            while (iterator3.hasNext()){
//                System.out.print(iterator3.next()+"  ");
//            }
//        }
//    }
//
