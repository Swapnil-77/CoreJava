package Modifiers;

class PrivateModifier{
    private String name = "Swapnil";  // Private
    private String account = "1234s3434";
    public String pass = "@121212";

    void display(){
        System.out.println("Hello " + name);
    }

    public String getName() {
        return name;
    }

    public void getBalance(){
        System.out.println("Account = "+ account);
        System.out.println("Pass = "+ pass);
    }
}

public class ModifierPrivate {
    public static void main(String[] args) {
    PrivateModifier privateModifier = new PrivateModifier();
        System.out.println(privateModifier.getName());
        System.out.println(privateModifier.getName());
        privateModifier.getBalance();
        privateModifier.pass ="jaduu@1111";
        privateModifier.getBalance();

    }
}
