package threaddemo;

public class Main extends Thread {
    public static void main(String[] args){
        Thread thread = new MyThread();
        thread.start();
    }
}
