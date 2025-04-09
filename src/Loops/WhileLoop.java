package Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int[] crr=new int[5];
        int c=10;
        int j=0;
        while(j<5)
        {
            crr[j]=c;
            c=c+10;
            j++;
        }
        System.out.println("---------------------------------");
        for(int i=0;i<5;i++)
        {
            System.out.println(crr[i]);
        }

        //stroing
        System.out.println("Hello World!");
    }
}
