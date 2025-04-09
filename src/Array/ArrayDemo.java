package Array;
import java.io.OptionalDataException;
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {

//        //Creating array method-1
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//
//        //creating array method-2
//        int[] mark = {90, 91, 92};
//        System.out.println(mark[0]);
//        System.out.println(mark[1]);
//        System.out.println(mark[2]);

        //creating array method-3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:"); // Debug message
        int size = sc.nextInt();

        int numbers[] = new int[size];
        System.out.println("Enter " + size + " numbers:"); // Debug message

        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Printing array:"); // Debug message
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }
}
