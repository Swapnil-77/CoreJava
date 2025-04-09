package oops;

public class OverridingTest {

    static class TestParent {
        static void m1() {
            System.out.println("parent");
        }

        void m2() {
            System.out.println("hello parent");
        }
    }

    static class TestChild extends TestParent {
        static void m1() {
            System.out.println("child");
        }

        @Override
        protected void m2() {
            System.out.println("hello child");
        }
    }

    public static void main(String[] args) {
        // Create object of TestChild
        TestChild child = new TestChild();

        // Call static method using class name
        TestChild.m1();     // prints "child"
        TestParent.m1();    // prints "parent"

        // Call instance method using object
        child.m2();         // prints "hello child"
    }
}
