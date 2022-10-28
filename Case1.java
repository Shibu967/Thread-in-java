public class Case1 extends Thread {
    public void run() {
        System.out.println("Task 1");
    }

    public static void main(String[] args) {
        Test thread1 = new Test();
        thread1.start();
    }

}// performing single task from single thread
