public class JavaInterruptExp2 extends Thread {
    public void run() {
        try {
            // Here current threads goes to sleeping state
            // Another thread gets the chance to execute
            Thread.sleep(500);
            System.out.println("javatpoint");
        } catch (InterruptedException e) {
            System.out.println("Exception handled " + e);
        }
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        JavaInterruptExp2 t1 = new JavaInterruptExp2();
        JavaInterruptExp2 t2 = new JavaInterruptExp2();
        // call run() method
        t1.start();
        // interrupt the thread
        t1.interrupt();
    }
}