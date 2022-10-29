public class JavaInterruptExp1 extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("javatpoint");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted..." + e);

        }
    }

    public static void main(String args[]) {
        JavaInterruptExp1 t1 = new JavaInterruptExp1();
        t1.start();
        try {
            t1.interrupt();
        } catch (Exception e) {
            System.out.println("Exception handled " + e);
        }
    }
}