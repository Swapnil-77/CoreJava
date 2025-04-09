package Loops;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] brr=new int[5];
        //storing
        int c=10;
        for(int i=0;i<5;i++)
        {
            brr[i]=c;
            c=c+10;
        }
        System.out.println("---------------------------");
        for(int data:brr)
        {
            System.out.println(data);
        }
    }
}
