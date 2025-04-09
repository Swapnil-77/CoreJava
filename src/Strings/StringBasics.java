package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
//        /*
//       String str = "Swapnil Phad";
//        System.out.println(str);
//         */
//
//        Scanner sc = new Scanner(System.in);
////        String s = sc.next();   //nusta next asel tr fkt space cha alikd print hot
//        String s = sc.nextLine();  //Atta jevdha sent.ahe te purn print hot
//        System.out.println(s);

        //Concatenation
        String FirstName = "Swapnil";
        String LastName = "Phad";
        String FullName = FirstName +" "+ LastName;
        System.out.println(FullName);
        System.out.println(FullName.length()); //prints the len of str

        //CharAt()
        for (int i=0; i<FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }

        //Compare
        String name1 = "Swapnil";
        String name2 = "Swapnil";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : value

        if (name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }


//        if (FirstName == LastName){
//        System.out.println("Strings are equal");
//       } else {
//           System.out.println("Strings are not equal");
//       }

        String sentence = "My name is Tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}
