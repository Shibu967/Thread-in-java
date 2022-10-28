class Case1 extends Thread {
    public void run() {
        System.out.println("task 1");
    }

}

class Case2 extends Thread {
    public void run() {
        System.out.println("task 2");
    }

}

class Case3 extends Thread {
    public void run() {
        System.out.println("task 3");
    }

}

public class Main {
    public static void main(String[] args) {
        Case1 c1 = new Case1();
        c1.start();
        Case2 c2 = new Case2();
        c2.start();
        Case3 c3 = new Case3();
        c3.start();

    }
}
