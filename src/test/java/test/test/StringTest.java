package test.test;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
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
        String[] str5=str2.split("[, .!?]");
        for (String st:str5){
            System.out.println(st);
        }
        System.out.println(Arrays.toString(str5));
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
}
