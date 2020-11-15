package innerclass;

public class BigClass {
    public String color;

    public static class SmallStaticClass {
        // Normal class that we have been using.
    }

    public class SmallInstanceClass {
        public void test() {
            // Notice that  you don't do "this.color" or "super.color", but use a special syntax.
            System.out.printf("The BigClass.color is " + BigClass.this.color);
        }
    }
}