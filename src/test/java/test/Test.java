package test;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args){
        String str = "Hello";
        test(str);
        System.out.println(str);
    }
    public static void test(String str){
        str+="World";


//        String str1="hello";
//        String str2="hello";
//        String str3="hello"+"world";
//        String str4=str2+"world";
//        String str5=new String("hello");
//        String str6=new String("hello");
//        String str7=str6.intern();
//        String str8=new String("hello").intern();
//       // System.out.println(str1==str2);
//// System.out.println(str3==str4);
////      System.out.println(str1==str5);
////       System.out.println(str5==str6);
//  System.out.println(str1==str7);
//  System.out.println(str1==str8);
//        String str9="hello";
//        str9+="world";
//        System.out.println(str3==str9);
//        System.out.printf("hello, %s %n", "world");
//        System.out.printf("大写a：%c %n", 'A');
//        System.out.printf("100 > 50：%b %n", 100 > 50);
//        System.out.printf("100除以2：%d %n", 100 / 2);
//        System.out.printf("100的16进制数是：%x %n", 100);
//        System.out.printf("100的8进制数是：%o %n", 100);
//        System.out.printf("100元打8.5折扣是：%f 元%n", 50 * 0.85);
//        System.out.printf("上述价格的16进制数是：%a %n", 50 * 0.85);
//        System.out.printf("上面的折扣是%d%% %n", 85);
//        String str = "hello, world!";
//        System.out.println(str.indexOf("e"));
//        System.out.println(str.indexOf('e'));
//        System.out.println(str.indexOf(101));
//
//        System.out.println(str.indexOf("o", 5));
//
//        System.out.println(str.indexOf("l"));
//        System.out.println(str.lastIndexOf("l"));
//        System.out.println(str.lastIndexOf("l", 9));
//        System.out.println("hello, world!".replace('o', 'A'));
//        System.out.println("hello, world!".replace("o", "Aaaa"));
//        System.out.println("hello, world!".replaceAll("o", "OOO"));
//        System.out.println("hello, world!".replaceAll("o", "s"));
       // System.out.println("        hello,world!       ".trim());
//        String str = "hello, world!";
//
//        System.out.println(str.substring(1));
//
//        System.out.println(str.substring(0, 1));
//        System.out.println(str.substring(0, str.length() - 1));
//        //System.out.println(str.substring(0, str.length() + 1));
//        System.out.println("F".equalsIgnoreCase("f"));

    }

    @org.testng.annotations.Test
    public void testName() {
        Integer[] arr = {1, 2, 3, 4, 5};
        int[] arr1={2,3,4,5,6,7,8,9,98};
        Integer[] arr2={98,234,234};
        System.out.println(Arrays.toString(arr));
        for(int a:arr1){
            System.out.print(a);
        }

//        System.out.println("1. for循环使用数组下标");
//        for (int index = 0; index < arr.length; index++) {
//            System.out.println(arr[index]);
//        }
//
//        System.out.println("2. for each循环");
//        for (int numb : arr) {
//            System.out.println(numb);
//        }

        System.out.println("3. Java 8新增的 Lambda 表达式");
        Arrays.asList(arr).forEach(numb -> System.out.println(numb));
        System.out.println("========================");
        Arrays.asList(arr1).forEach(System.out::println);
        Arrays.asList(arr2).forEach((num)-> System.out.println(num));
//        int[] jj=()->System.out.println("go to hell");
        //List arr1=Arrays.asList("go to hell");
//        arr1.forEach((str)->System.out.println(str));
        //arr1.forEach(System.out::println);
//        AbstractButton follow = null;
//        follow.addActionListener((e) -> System.out.println("已关注公众号:程序 新视界"));


    }

    @org.testng.annotations.Test
    public void testmy() {
        Integer[] arr1 = {1, 2, 3, 4, 5,6,7,8,9,10};
        Integer[] arr2 = {11, 12, 13, 14, 15,16,17};
//        int[] arry = {32, 34, 234, 23, 42, 67, 78, 45, 78};
//
//// 拷贝数组 arr1 的前 3 个元素
//        Integer[] arr3 = Arrays.copyOf(arr1, 3);
//        System.out.println(Arrays.toString(arr3));
//        System.out.println("=====================");
//        //System.out.println(Arrays.copyOf(arry, 16));
//        int[] arr4=Arrays.copyOf(arry,4);
//        System.out.println(Arrays.toString(arr4));
//        System.out.println("=====================");
//        int[] arr5=Arrays.copyOfRange(arry,2,6);
//        System.out.println(Arrays.toString(arr5));
//        System.out.println("======================");
//        System.arraycopy(arr2,3,arr1,2,3);
//        System.out.println(Arrays.toString(arr1));

// 拷贝数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
//        Integer[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
//        System.out.println(Arrays.toString(arr4));
//
//// 拷贝数组 arr2 的后 3 位到 arr1 到后 3 位(arr2里从下标为2开始的三位数覆盖arr1下标为2开始的三个数字）
        System.arraycopy(arr2, 2, arr1, 2, 3);
        System.out.println(Arrays.toString(arr1));
//

    }

    @org.testng.annotations.Test
    public void test11() {
        int arr[] = new int[10];
        Integer[] arr1=new Integer[5];
//        Arrays.fill(arr, 5);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr);
//        Arrays.fill(arr1,10);
//        System.out.println(arr1);
//        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,2,4,99);
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr,2,6,88);
        System.out.println(Arrays.toString(arr));


//
//        Arrays.fill(arr, arr.length - 3, arr.length, 3);
//        System.out.println(Arrays.toString(arr));

    }

    @org.testng.annotations.Test
    public void testsort() {
        int arr[] = new int[10];
        for (int i= 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("排序前：" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    @org.testng.annotations.Test
    public void testsort1() {
        int[] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=new Random().nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,new Random().nextInt()));
    }

    @org.testng.annotations.Test
    public void testArr() {
        String[][] users = new String[3][];
        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "女";
        users[0][3] = "25";

        users[1] = new String[4];
        users[1][0] = "002";
        users[1][1] = "李四";
        users[1][2] = "男";
        users[1][3] = "30";
        //String[][] users=new String[][];
//        int[][] num=new int[3][3];
//        //num[0][0]=1;
//        num[0][0]=1;




  //String users1[][]={{"001","hh","girl","25","love"},{"002","hd","boy","25"},{"003","gg","girl","16"}};
//
//        System.out.println(Arrays.toString(users));
//        System.out.println(users);
        for(String[] user:users){
            System.out.println(Arrays.toString(user));
        }
//
//        for (String[] user : users) {
//            System.out.println(Arrays.toString(user));
//        }

    }

    @org.testng.annotations.Test
    public void testee() {
        Integer[] n = new Integer[5];
        //随机生成方法
        n[0]=new Random().nextInt(10);
        n[1]=new Random().nextInt(5);
        n[2]=new Random().nextInt(10);
        n[3]=new Random().nextInt(10);
        n[4]=new Random().nextInt(10);
//        System.out.println(Arrays.toString(n));
//        for(int n1:n){
//            System.out.println(n1);
//        }
        Arrays.asList(n).forEach(System.out::print);
        System.out.println("");
        Arrays.asList(n).forEach((n1)->System.out.print(n1));

    }
}

