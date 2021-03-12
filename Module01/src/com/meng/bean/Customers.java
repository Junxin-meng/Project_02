package com.meng.bean;

import java.util.ArrayList;

public class Customers extends Person {

    //    public static final int GETINITIALSIZE=10;
    private static final int INITIALSIZE = 10;
    private static int num;

    public void eat() {
//        System.out.println("吃饭");
        super.eat();
        System.out.println("我吃饭");
    }

/*    public static void main(String[] args) {
        //region Description
        int a = ((3 * 1) - (3 * ((2 * 2) + 1))) + (3 * 3) + INITIALSIZE;
//        System.out.println("HelloWord!!" + a);
        System.out.println("HelloWord!!" + "\r" + "a=" + a);
//        Date date = new Date();
//        Date date = new Date();
        ArrayList list = getArrayList();
        System.out.println("ArrayList:" + list);

        list.remove(2);

        System.out.println("ArrayList:" + list);
        System.out.println("ArrayList:" + list.get(2));
        Date date = new Date();
        System.out.println("ArrayList+lastIndexOf:" + list.lastIndexOf(1));
        System.out.println("ArrayList+indexOf:" + list.indexOf(1));

//        list.add(1, 1);
//        list.add(1,1);
        synchronized ()
//        synchronized ()
//        synchronized ()
        num = 1;
        System.out.println("mian+num+before:" + num);
        method1();
        System.out.println("mian+num+after:" + num);
//        eat();
    }*/

    public static ArrayList getArrayList() {
        ArrayList list = new ArrayList();
        //endregion
        list.add(0, 1);
        list.add(1, 1);
        list.add(2, 3);
        list.add(2, 2);
        list.add(2, 2);
        return list;
    }

    public static void method1() {
        num = 0;
        System.out.println("method1+num+between:" + num);
//        try {
//            FileInputStream fis = new FileInputStream("hello.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }


}
