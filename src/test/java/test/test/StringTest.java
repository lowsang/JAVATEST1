package test.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.Test;
import sun.text.normalizer.UnicodeSetIterator;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.function.DoubleToIntFunction;

public class StringTest {
    @Test
    public void testString() {
        String str="helloworld";
        String str1=new String("hellofuck");
        char[] cha={'c','h','a','r'};
        Character[] cha1={'g','d','h','b'};
        char[] chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(String.valueOf(4));
        System.out.println(str.toUpperCase());
//        cha[3]='j';
//        String str2=new String(cha);
//        String str3=new String(cha,1,2);
//        System.out.println(str2);
//        System.out.println(str3);
//        String str4=new String();
//        System.out.println('a'+str4+'b');
//        System.out.println(new String(cha));
//        System.out.println(new String(cha,1,2));
//        System.out.println(str1.charAt(str1.length()-2));
////        for(char cc:cha){
////            System.out.println(cc);
////        }
//        Arrays.asList(cha1).forEach(System.out::print);
//        System.out.println("");
//        Arrays.asList(cha1).forEach((chars -> System.out.println(chars)));
        boolean[] flag=new boolean[]{false,true,true};
        Boolean[] flag1=new Boolean[]{false,true,false};
        Arrays.asList(flag).forEach(System.out::println);
        System.out.println("");
        Arrays.asList(flag1).forEach(System.out::println);
    }

    @Test
    public void testString1() throws UnsupportedEncodingException {
        String str="helloworld";
        String str1=new String("hellohood");
        char[] cha={'c','h','a','r'};
        Character[] cha1={'g','d','h','b'};
        byte[] bytes=new byte[]{2,3,4,1,68,65,67};
        Byte[] bytes1=new Byte[]{4,5,2};
//        //System.out.println(bytes);
//        String str2=new String(bytes);
//        System.out.println(str2);
//        byte[] bytes2=str.getBytes();
//        for(byte by:bytes2){
//            System.out.println(by);
//        }
//        for(byte b:bytes){
//            System.out.print(b);
//        }
//        System.out.println("");
//        System.out.println("======================");
//        Arrays.asList(bytes1).forEach((bytes2 -> System.out.print(bytes2)));
//        //System.out.println(new String(bytes));
//        System.out.println("");
//        System.out.println("======================");
    }

    @Test
    public void testCompare() {
//        String str="hello";
//        String str1="hello";
//        String str4=new String("hello");
//        String str2="Hello";
//        String str3="helloworld";
//        System.out.println(str.equals(str1));
//        System.out.println(str.equals(str4));
//        System.out.println(str==str1);
//        System.out.println(str==str4);
//        System.out.println(str.equalsIgnoreCase(str2));f
        String str="acccwwww";
        String str2="Abbb";
        System.out.println(str.compareTo(str2));
    }

    @Test
    public void testcontain() {
        String str="accbbhhjjwwww";
        String str2="Aa,bs cb.ee!brt";
        String str4="";
        String str5=String.format("%s,%d%n,%b,%h","sdafa",234,false,'A');
        System.out.println(str5);
//        String[] str5=str2.split("[, .!?]");
//        for (String st:str5){
//            System.out.println(st);
//        }
//        System.out.println(Arrays.toString(str5));
        //System.out.println(String.format(str,"%c",'c'));
//        System.out.println(str2);
        //System.out.println(str4.isEmpty());
//        System.out.println(str2.toLowerCase());
//        System.out.println(str2.toUpperCase());
//        System.out.println(str2.trim());
//        System.out.println(str2.charAt(3));
//        String str3=new String("Abbb").intern();
//        System.out.println(str2==str3);
//        System.out.println(str2);
//        System.out.println(str2.toString());
//        System.out.println(str.contains("a"));
//        System.out.println(str.indexOf("a"));
//        System.out.println(str.indexOf("w",9));
        //System.out.println(str.lastIndexOf("w"));
//        System.out.println(str.startsWith("a"));
//        System.out.println(str.endsWith("b"));
//        System.out.println(str.substring(1));
//        System.out.println(str.substring(1,6));
//        String[] str3=str2.split("b",5);
//        //数组的三种输出方式
//        for(String str6:str3){
//            System.out.print(str6+",");
//        }
//        System.out.println("");
//        System.out.println(Arrays.toString(str3));
//        Arrays.asList(str3).forEach(System.out::println);
////        System.out.println(str2.replace("","weqw"));
////        System.out.println(str2.replaceAll("","aaaa"));
////        System.out.println(str2.replaceFirst("b","jijiji"));
//        byte i=10;
//        byte[] num={1,3,55,99};
//        String s1="!aBaCd";
//        String s2="aBcD";
////        String s3=s1+num[3]+s2;
////        System.out.println(s3);
////        String s4=s1+1000;
////        System.out.println(s4);
////        char[] cc=s4.toCharArray();
////        System.out.println(Arrays.toString(cc));
////        System.out.println(s1.concat("lowsang"));
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.compareToIgnoreCase(s2));

    }

    @Test
    public void testBuilder() {
        StringBuffer str=new StringBuffer();
        str.append("adc");
        str.append(123);
        str.append('g');
        str.append(true);
        System.out.println(str);
        str.delete(6,8);
        System.out.println(str);
        System.out.println(str.reverse());
        System.out.println(str.insert(3,false));
        StringBuilder str1=new StringBuilder();
        str1.append("2s");
        str1.append("大家我是周杰伦");
        str1.append(2234);
        str1.append(false);
        System.out.println(str1);
        str1.deleteCharAt(5);
        System.out.println(str1);
        System.out.println(str1.reverse());
        System.out.println(str1.insert(4,"23df234true"));
        System.out.println(str1.deleteCharAt(1));
        System.out.println(str1.delete(2,8));
    }

    @Test
    public void testHashcode() {
//        String name="hee";
//        String num="hee";
//        char[] ch={'h','e','e'};
//        boolean flag=true;
//        long s=23423423;
//        Integer ss=234234;
//        Character ch1='A';
//        System.out.println(name.hashCode());
//        System.out.println(num.hashCode());
//        System.out.println(ch.hashCode());
//        System.out.println(ss.hashCode());
//        System.out.println(ch1.hashCode());
        List<String> list1=new ArrayList<String>();
        list1.add("hhhh");
        list1.add("jkjjjj");
        list1.add("dddd");
        System.out.println(list1);
        Iterator iterator=new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };

        if(list1.iterator().hasNext()){
            System.out.println(list1);
        }
        Iterator iterator1=new ListIterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Object previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Object o) {

            }

            @Override
            public void add(Object o) {

            }
        };
        if(list1.iterator().next()!=null){
        System.out.println(list1);}
        if(list1.iterator().hasNext()){
            System.out.println(list1);
        }

    }
}
