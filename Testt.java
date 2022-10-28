public class Testt implements Runnable {
    public void run() {

        System.out.println("Thread Task 2");
    }

    public static void main(String[] args) {
        Testt t = new Testt();
        Thread th = new Thread(t);
        th.start();

    }

}
