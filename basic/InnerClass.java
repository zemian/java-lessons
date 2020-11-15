import innerclass.BigClass;

/**
 * You can nest class type definition inside another class
 *
 * In fact you have been doing this in many lessons already. We will explore few ways this can
 * affect your code. We do this on occasion that we need a quick type that only needed internally
 * for a specific use.
 *
 * NOTE: It's always recommended to create separate class on its file. Especially for libraries that
 * will be given to users as SDK.
 */
public class InnerClass {
    public static void main(String[] args) {
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
