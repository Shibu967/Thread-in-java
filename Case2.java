public class Case2 extends Thread {
    public void run() {
        System.out.println("Task 1");
    }

    public static void main(String[] args) {
        Case2 thread1 = new Case2();
        thread1.start();

        Case2 thread2 = new Case2();
        thread2.start();
    }

}// performing single task from multiple thread
