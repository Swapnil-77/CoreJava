package Multithreading;

//class YourRunnable implements Runnable {
//    @Override
//    public void run() {
//        for (int i=0; i<5; i++){
//            System.out.println("baby thread "+i);
//        }
//    }
//}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            System.out.println("child thread "+i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
//        YourRunnable y = new YourRunnable();
//        Thread t1 = new Thread(y);
//        t1.start();
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<5;i++)
        {
            System.out.println("main thread "+i);
        }
//        for (int i=0; i<5; i++){
//            System.out.println("baby baby thread "+i);
//        }
    }
}
