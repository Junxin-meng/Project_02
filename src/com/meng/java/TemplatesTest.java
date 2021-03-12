package com.meng.java;

import com.meng.bean.Customers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemplatesTest {
    /**
      *哈哈
      *傻逼
      **/
    //模板6：prsf
    private static final Customers cust = new Customers();
    //变形：psf   psfi   psfs
    public static final int NUM = 1;
    public static final int COURSE = 10;
    public static final String NAME = "Mary";
    //模板1：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println();
        System.out.println("hello!");
        //变形：soutp    soutm    soutv    xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
//        method();
        System.out.println("args = " + args);
        int num1=1;
        System.out.println("num1 = " + num1);
        int num2=2;
        int num3=3;
        System.out.println("num3 = " + num3);
        System.out.println(num2);//xxx.sout
        //模板3：fori
        String[] arr = {"Tom","Mary","Lilei","Liming","Lihua"};
        System.out.println("arr = " + arr);
        System.out.println("fori模板");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        //变形：iter   itar
        System.out.println("\niter模板");
        for (String s : arr) {
            System.out.print(s);
            System.out.print(",");
        }
        System.out.println("\nitar模板");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.print(s);
            System.out.print(",");
        }
        System.out.println("\narr = " + arr[4]);
//        System.out.println("arr = " + arr[5]);
//        System.out.println("arr = " + arr[6]);
        System.out.println("arr = " + arr[0]);
        System.out.println(arr.length);
        //模板4：list.for
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print("list.for:");
        for (Object o : list) {
            System.out.print(o);
        }
//        变形：list.fori    list.forr
        System.out.print("\nlist.fori:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.print("\nlist.forr:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
        method();
    }
    public static void method(){
        
        System.out.println("TemplatesTest.method");
        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
        //模板5：ifn
//        System.out.println(list.get(0));
        if (list.isEmpty()){
            System.out.println("list为空");
        }//list.isEmpty对的;list==null错的。
        if (list == null) {
            System.out.println("list为空（ifn）");
        }
        //变形：inn  list.nn   list.null
        if (list != null) {
            System.out.println("list不为空（inn）");
        }
        if (list != null) {
            System.out.println("list不为空（list.nn）");
        }
        if (list == null) {
            System.out.println("list为空（list.null）");
        }
    }
}
