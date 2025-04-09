package Functions;

class Student{
    public void study(){
        System.out.println("study");
    }
    public int sum(int a, int b){
        int c = a + b;
        return c;
    }
    public String UserName(){
        return "kali das";
    }
}

public class MethodsDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        System.out.println(student.sum(10,10));
        int res = student.sum(10,10);
        System.out.println(res);
        String name = student.UserName();
        System.out.println(name);
    }
}
