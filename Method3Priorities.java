public class Method3Priorities extends Thread {
    public void run() {
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Method3Priorities p = new Method3Priorities();
        p.start();
    }

}
