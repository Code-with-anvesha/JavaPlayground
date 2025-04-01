public class Thread_priority2 extends Thread {
    public Thread_priority2(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(getName() + " started with priority " + getPriority());
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + ": " + i);
        }
        System.out.println("Exit from " + getName());
    }

    public static void main(String[] args) {
        Thread_priority2 t1 = new Thread_priority2("Thread A", Thread.MIN_PRIORITY);
        Thread_priority2 t2 = new Thread_priority2("Thread B", Thread.NORM_PRIORITY);
        Thread_priority2 t3 = new Thread_priority2("Thread C", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread ends.");
    }
}