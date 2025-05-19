package Exception;

public class FinallyDemo {
    public static void main(String[] args) {

        try {
            //throw new RuntimeException();
            //System.out.println(10/2);
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("i am in catch");
            e.printStackTrace();
        } finally {
            System.out.println("Best class in india");
            System.out.println("spark 2.0");
        }
    }
}
