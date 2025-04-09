package ThisDemo;

class Animal {

    String name;
}

class Dog extends Animal {
    String name; //sheruu

    void print(){
        //this--> current
        //super--> parent
        super.name = "Animal";
        this.name = "Sheruu";
        System.out.println("Parent name = "+super.name);
        System.out.println("Child name = "+this.name);
    }
}
public class ThisDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print();
    }
}
