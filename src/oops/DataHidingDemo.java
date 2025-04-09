package oops;
// data hiding
class ATM{
    private String UserName;

    private String pass;

    private String bal;

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
public class DataHidingDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.setBal("10000");
        atm.setPass("777");
        atm.setUserName("Swapnil");

        System.out.println(atm.getUserName());
        System.out.println(atm.getBal());
        System.out.println(atm.getPass());
    }
}
