/*
Java support Generic Type (a variable to represent a unknown type).
You already used collection types such as ArrayList and HashMap. They both
uses Generic type "<Type>" syntax to tell compiler what data they hold. Without
this, you will have to reduce to duplicate the class, one for each type. Or
use dump "Object" to hold the data, which lose the type information. Generic
allow you to solve this problem.

Main focus:
- Learn how to object data with Object and then cast
- Learn to write type definition with generic
- Learn about Java reflection and their related classes.
- There are a lot more to generic - see https://docs.oracle.com/javase/tutorial/java/generics/types.html
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericType {
    public static void main(String[] args) {
        // Let's learn about casting first.
        Object obj = new MyData("foo");
        // System.out.println(obj.name); // ERROR
        MyData specific = (MyData)obj;
        System.out.println(specific.name);

        // Now let's see some custom generics in action
        DataContainer<Integer> d1 = new DataContainer<>(10);
        d1.add(99);
        System.out.println(d1);

        DataContainer<MyData> d2 = new DataContainer<>(100);
        d2.add(new MyData("foo"));
        d2.add(new MyData("bar"));
        System.out.println(d2);
    }

    public static class DataContainer<T> {
        T[] dataArray;
        int currentIndex = -1;
        int capacity = 100;

        public DataContainer(int capacity) {
            this.capacity = capacity;
        }

        public void add(T item) {
            if (dataArray == null) {
                dataArray = (T[]) Array.newInstance(item.getClass(), capacity);
            }

            currentIndex++; // to be inserted index
            if (currentIndex >= capacity) {
                throw new RuntimeException("Exceed limit");
            }
            dataArray[currentIndex] = item;
        }

        public T get(int index) {
            if (index < 0 || index >= dataArray.length) {
                throw new RuntimeException("Invalid index");
            }
            return dataArray[index];
        }

        @Override
        public String toString() {
            if (currentIndex < 0) {
                return "DataContainer{}";
            }
            return "DataContainer{" + Arrays.asList(Arrays.copyOf(dataArray, currentIndex + 1)) + "}";
        }
    }

    public static class MyData {
        public String name;
        public MyData(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "MyData{" + name + "}";
        }
    }
}
