package IfElse;

public class IncreDecre {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println(a); //10


        System.out.print("post inc=");
        a++; //post increment
        System.out.println(a);

        //a==11

        System.out.print("post dec=");
        a--; //post dec
        System.out.println(a);
        //a==10

        //b==5
        System.out.print("pre inc=");
        ++b; //pre increment
        System.out.println(b);
        //b=6

        System.out.print("pre dec=");
        --b; //pre dec
        System.out.println(b);
        //b==5
    }
}
