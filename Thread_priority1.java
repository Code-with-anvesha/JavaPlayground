public class Thread_priority1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + getPriority() + " is running.");
    }

    public static void main(String[] args) {
        Thread_priority1 t1 = new Thread_priority1();
        Thread_priority1 t2 = new Thread_priority1();
        Thread_priority1 t3 = new Thread_priority1();

        t1.setPriority(3);
        t2.setPriority(6);
        t3.setPriority(9);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}