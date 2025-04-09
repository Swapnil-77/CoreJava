package Strings;

public class StringDemo1 {
    public static void main(String[] args) {

        String city=new String("Agra");
        String city1 = new String("Delhi");
        String city2=city;

        System.out.println(city1==city);  // reference com  //False
        System.out.println(city2==city);                    //True

        String s1="Agra";
        System.out.println(city==s1);                       //False
        System.out.println(city.equals(s1)); //content com  //True

        String s2="Arjun";
        String s3="Arjun";
        System.out.println(s3==s2);                         //True

    }
}
