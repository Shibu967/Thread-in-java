public class Method1byThreadclass extends Thread {
    public void run() {
        System.out.println("Thread Task : " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        System.out.println("Hello " + Thread.currentThread().getName());

        Method1byThreadclass t1 = new Method1byThreadclass();
        // t1.setName("Shibu");
        t1.start();

        // Test t2 = new Test();
        // t2.setName("Smart Shibu");
        // t2.start();
    }

}
