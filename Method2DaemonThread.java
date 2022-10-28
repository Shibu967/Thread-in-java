public class Method2DaemonThread extends Thread {

    public void run() {
        System.out.println("daemon thread");

    }

    public static void main(String[] args) {
        System.out.println("main thread");
        Test t = new Test();
        t.setDaemon(true);
        t.start();
    }
}
