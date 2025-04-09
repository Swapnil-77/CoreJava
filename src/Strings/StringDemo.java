package Strings;

public class StringDemo {
    public static void main(String[] args) {

        String s1="hello";
        String s2="hello";
        System.out.println(s2==s1);             //True

        String s3=new String("hey");
        String s4=new String("hey");
        System.out.println(s3==s4);             //False

        String s5="hey";
        System.out.println(s3==s5);             //False
        System.out.println(s3.hashCode());
        System.out.println(s5.hashCode());

        //== memory address
        //equals content
        System.out.println(s3.equals(s5));      //True
    }
}
