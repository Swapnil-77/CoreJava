package IfElse;

public class IncreDecre2 {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        a++; //a=11
        System.out.println(a++ + b);  //13
        System.out.println(a); //11
        //in post inc value used for computing the res and
        //then increment

        int d=90;
        int k=2;
        System.out.println(d--); //post value
        //d=89
        System.out.println(d-- + k);
        //it is using orignal value not previous value

        int l=10;
        int f=3;
        System.out.println(++l);
        System.out.println(--f);

    }
}
