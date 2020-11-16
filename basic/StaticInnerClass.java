import innerclass.BigClass;
import innerclass.StaticMembersClass;

/**
 * Static and Inner Classes
 *
 * Main focus:
 * - The "static" keyword is used to NOT use object instance and turns storage as one global space.
 * - You can nest class type definition inside another class
 *
 * In fact you have been doing this in many lessons already. We will explore few ways this can
 * affect your code. We do this on occasion that we need a quick type that only needed internally
 * for a specific use.
 *
 * NOTE: It's always recommended to create separate class on its file. Especially for libraries that
 * will be given to users as SDK.
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        // Test static members
        System.out.println(StaticMembersClass.staticCounter);
        StaticMembersClass.staticCounter++;
        System.out.println(StaticMembersClass.staticCounter);

        StaticMembersClass obj = new StaticMembersClass();
        System.out.println(obj.instanceCounter);
        obj.instanceCounter++;
        System.out.println(obj.instanceCounter);

        // Notice the static member does not affect the instance
        StaticMembersClass.staticCounter++;
        System.out.println(StaticMembersClass.staticCounter);
        System.out.println(obj.instanceCounter);
        // Or the other way.
        obj.instanceCounter++;
        System.out.println(StaticMembersClass.staticCounter);
        System.out.println(obj.instanceCounter);

        // Test inner classes
        BigClass bigClassObject = new BigClass();
        System.out.println(bigClassObject);

        BigClass.SmallStaticClass smallStaticClassObject = new BigClass.SmallStaticClass();
        System.out.println(smallStaticClassObject);

        // You can't instantiate inner instance class type without a instance!
        //BigClass.SmallInstanceClass smallInstanceClassObject = new BigClass.SmallInstanceClass(); // ERROR!
        BigClass.SmallInstanceClass smallInstanceClassObject = bigClassObject.new SmallInstanceClass();
        System.out.println(smallInstanceClassObject);
    }
}
