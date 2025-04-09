package FinalDemo;

final class finalTest{
    final void m1()
    {
        System.out.println("Hello");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        System.out.println(a);

        final int b=10; //valid
        final String name="Piyush";
        //b=20; //invalid
        System.out.println(b);
        System.out.println(name);

        finalTest f=new finalTest();
        f.m1();
    }
}
