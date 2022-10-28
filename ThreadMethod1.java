public class ThreadMethod1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Shibu");
        System.out.println("New thread Name " + Thread.currentThread().getName());
    }

}
// name related method