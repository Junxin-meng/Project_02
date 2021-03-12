package com.meng.java;

import com.meng.bean.Customers;
import com.meng.bean.Person;

public class HelloWord {
    public static void main(String[] args){
        System.out.println("HelloWord!!");
        Person person = new Person();
        Customers customers = new Customers();
        customers.eat();
    }
}
