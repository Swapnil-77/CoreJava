package Constructors;

class Monkey{
    public void sound(){
        System.out.println("kho kho");
    }
}


class Animal
{
    Monkey monkey;
    public void m1()
    {
        System.out.println("m1");
    }
    public void sound(){
        monkey.sound();
    }

    public void sum(int a,int b){
        System.out.println(a+b);
    }
    Animal(){
        System.out.println("Constructor chal raha hai... ");
    }
}
public class Demo {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.m1();
        a.sum(2,4);
        a.sound();
    }

}
