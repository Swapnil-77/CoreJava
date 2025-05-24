package InterfaceDemo;
 interface Remote {
    void pressPowerButton();  // kya karna hai bata diya, kaise karna hai wo nahi
}
class LGRemote implements Remote {
    public void pressPowerButton() {
        System.out.println("Turning on LG TV");
    }
}

class SamsungRemote implements Remote {
    public void pressPowerButton() {
        System.out.println("Turning on Samsung TV");
    }
}
public class RemoteDemo{
    public static void main(String[] args) {
        LGRemote lgRemote = new LGRemote();
        lgRemote.pressPowerButton();

        SamsungRemote samsungRemote = new SamsungRemote();
        samsungRemote.pressPowerButton();
    }
    }

