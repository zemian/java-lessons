/*
Collection Types - like an array, a special type that act as data value container.

Main focus:
- Learn two most used types: ArrayList and HashMap.
- Learn about generic type syntax with "Name<Type>" syntax.
- ArrayList and HashMap can only work with wrapper type, not primitives.
- ArrayList and HashMap can can be self-nested!

Further study:
- Learn how to use java.util.Set, it's already been used to store HashMap keys!
- See more methods available for List at
  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
- See more methods available for Map at
  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html
- Learn different ways on creating List or Map using interface holder:
    List<Integer> list = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
- Learn about immutable List.of(1, 2, 3) or Arrays.asList(1, 2, 3)
- Learn about immutable Map.of("foo", 77, "bar", 88)
- Explore how Object.equals() and Object.hashCode() affect HashMap keys.

Exercise:
1. Process args and filter out ones starts with "-"
2. Count letter frequency in a string
3. Reverse a list elements
4. Create a map of this type: HashMap<String, ArrayList<Integer>> and populate with some data
 */

// You need to import the collection type classes first
import java.util.*;

public class CollectionTypes {
    public static void main(String[] args) {
        //
        // ArrayList
        //

        // List - Dynamic Array
        ArrayList<Integer> list = new ArrayList<>();

        // Add data
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list); // Notice that unlike array, list prints content!

        // Get data individually
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // Count size
        System.out.println(list.size());

        // Remove data
        list.remove(0);
        System.out.println(list);

        // Update data
        list.set(0, 99);
        System.out.println(list);

        // Loop data
        for (Integer item : list) {
            System.out.println(item);
        }

        // Append large data
        for (int i = 0; i < 100_000; i++) {
            list.add(99i);
        }
        System.out.println(list.size());
        System.out.println(list.get(list.size() - 1)); // Get last item

        // Clear the list
        list.clear();

        // Converting array to List
        Integer[] array = {1, 2, 3}; // Notice that you must use "Integer" and not "int"
        ArrayList<Integer> arrayList = new ArrayList(java.util.Arrays.asList(array));
        System.out.println(array);
        System.out.println(arrayList);

        // You can convert a list back to array
        list.add(0, 4);
        Integer[] arrayAgain = list.toArray(new Integer[0]); // Notice that you need to give empty array with type!
        System.out.println(arrayAgain[0]);

        // You can quickly print an array using List as a wrapper
        System.out.println(arrayAgain); // not readable
        System.out.println(java.util.Arrays.asList(arrayAgain)); // Now it's readable

        // Shortcuts on Creating ArrayList
        ArrayList<Integer> quickList = new ArrayList<>(List.of(8, 6, 9, 3));
        System.out.println(quickList);

        //
        // HashMap
        //
        // Map - Key Value entry dictionary
        HashMap<String, Integer> map = new HashMap<>();

        // Add data
        map.put("foo", 77);
        map.put("bar", 88);
        map.put("baz", 99);
        System.out.println(map);

        // Get data by key
        System.out.println(map.get("foo"));
        System.out.println(map.get("bar"));
        System.out.println(map.get("baz"));
        System.out.println(map.get("bad_key")); // Output: null

        // Check key exists
        System.out.println(map.containsKey("bar"));
        System.out.println(map.containsKey("bad_key"));

        // Count size
        System.out.println(map.size());

        // Remove data
        map.remove("foo");
        System.out.println(map);

        // Update data
        map.put("bar", 5555); // Just override the existing key value
        System.out.println(map);

        // Loop data - get all keys
        for(String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Entry " + key + " => " + value);
        }

        // Append large data
        for (int i = 0; i < 100_000; i++) {
            map.put("mykey_" + i, 99i);
        }
        System.out.println(map.size());
        System.out.println(map.get("mykey_99999"));

        // Clear the map
        map.clear();
        System.out.println(map);

        // Shortcuts on Creating HashMap
        HashMap<String, Integer> quickMap = new HashMap<>(Map.of("foo", 99, "bar", 88));
        System.out.println(quickMap);


        //
        // Extra collection related topics
        //

        // Print pretty array
        int[] numbers = {1, 2, 3};
        System.out.println(numbers); // It does not print pretty
        System.out.println(List.of(numbers)); // It does not print pretty either! - See how variadic capture arguments
        Integer[] numbers2 = {1, 2, 3};
        System.out.println(List.of(numbers2)); // It prints pretty! because we use wrapper
        System.out.println(List.of(1, 2, 3)); // It prints pretty! because variadic capture correctly
        char[] letters = {'a', 'b', 'c'};
        System.out.println(letters); // It prints pretty! because println() explicitly handle this type

        // Arrays.asList() vs List.of()
        // You can't verify this until you learn more about List interface
        List<Integer> quickList1 = Arrays.asList(1, 2, 3); // Arrays.asList() gives semi-immutable list
        List<Integer> quickList2 = List.of(1, 2, 3); // List.of() gives completely immutable list.
        System.out.println(quickList1);
        System.out.println(quickList2);
        quickList1.set(0, 99);
        System.out.println(quickList1);
//        quickList2.set(0, 88); // Will give Error
//        System.out.println(quickList2);

        // Sort elements in list
        Collections.sort(quickList);
        System.out.println("sorted quickList: " + quickList);

        // Set - Unique set of items
        HashSet<String> set = new HashSet<>();
        set.add("foo");
        set.add("bar");
        System.out.println(set);
        set.add("foo"); // Nothing will happens since we already have one exists!
        System.out.println(set.contains("foo"));
        System.out.println(set.size());
        System.out.println(set.remove("foo"));
        // You can't access element by index, you need to iterate through them
        System.out.println(set.iterator().next());
        // If you need element by index, convert them into list first
        System.out.println((new ArrayList(set)).get(0));

        // Getting HashMap keys requires a generic set (interface)
        Set<String> keys = map.keySet();
        System.out.println(keys);
    }
}
