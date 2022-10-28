public class Test extends Thread {

    public void run() {
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
// creat by thread class