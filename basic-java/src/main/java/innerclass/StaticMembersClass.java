package innerclass;

// You can't use static on top level class
public class StaticMembersClass {

    // When you are inside a class, accessing static member does not need to prefix with "StaticClass."
    // It's optional to add prefix inside class, but out of this class then you must need to use it
    // or use "import static" statement.

    // STATIC Members
    public static int staticCounter = 0;

    // Anything inside the class you can add "static" to it. When you do this
    // you no longer dealing with class Type Definition that involve "instance".
    // In another you can't use "this" keyword.

    static public void testStaticFoo() {
        System.out.println("I am static foo function. StaticClass.staticCounter=" + staticCounter);
    }
    // - A static method must call another static method, can't call instance method.
    static public void testStaticBar() {
        testStaticFoo();
        //testInstanceFoo(); // ERROR
    }

    // NON STATIC / INSTANCE MEMBERS
    public int instanceCounter = 0;

    public void testInstanceFoo() {
        System.out.println("I am static foo function. instanceCounter=" + this.instanceCounter);

        // Calling static function is okay
        testStaticFoo();
    }

}
