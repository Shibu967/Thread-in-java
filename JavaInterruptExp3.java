public class JavaInterruptExp3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }

    public static void main(String args[]) {
        JavaInterruptExp3 t1 = new JavaInterruptExp3();
        // call run() method
        t1.start();
        t1.interrupt();
    }
}