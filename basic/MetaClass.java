/*
Meta mean about itself, so Meta Class mean information describing a Class.

When you write a Class type definition, Java will load it and represent it
using a special type called "java.lang.Class". Hence it's a type about type (or
Meta Class)! Given an instance of a "java.lang.Class", you can query a lot of
information about a type programmatically.

Main focus:
- Get class object
- Use reflection to query information about class object
- Create new instance from class object

Further study:
- You can invoke method through class object!
 */

import packages.Apple;

import java.lang.reflect.Method;

public class MetaClass {
    public static void main(String[] args) throws Exception {
        // You can get Class information by Class object.
        Class<Apple> appleClass = Apple.class;
        System.out.println(appleClass.getName());

        // You can get list of methods!
        Method[] methods = appleClass.getMethods();
        for (Method meth : methods) {
            System.out.println(meth.getName());
        }

        // Convert string to class object
        Class<Apple> appleClass2 = (Class<Apple>) Class.forName("packages.Apple");
        System.out.println(appleClass2.getName());

        // You can create instance from classObject!
        Apple apple = appleClass2.newInstance();
        System.out.println(apple);
    }
}
