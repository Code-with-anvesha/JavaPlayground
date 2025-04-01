class A1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            if (i == 1) {
                Thread.yield(); // Yielding control
            }
            System.out.println("Thread A1 = " + i);
        }
        System.out.println("Exit from A1");
    }
}

class B1 extends Thread {
    public void run() {
        for (int j = 1; j < 5; j++) {
            System.out.println("Thread B1 = " + j);
            if (j == 3) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("B1 Interrupted: " + e);
                }
            }
        }
        System.out.println("Exit from B1");
    }
}

class C1 extends Thread {
    public void run() {
        for (int k = 1; k < 5; k++) {
            System.out.println("Thread C1 = " + k);
            if (k == 1) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("C1 Interrupted: " + e);
                }
            }
        }
        System.out.println("Exit from C1");
    }
}

public class Thread_Practice1 {
    public static void main(String[] args) {
        A1 threadA1 = new A1();
        B1 threadB1 = new B1();
        C1 threadC1 = new C1();

        // Setting thread priorities
        threadA1.setPriority(Thread.MIN_PRIORITY);
        threadB1.setPriority(Thread.NORM_PRIORITY);
        threadC1.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Starting thread A1...");
        threadA1.start();

        System.out.println("Starting thread B1...");
        threadB1.start();

        System.out.println("Starting thread C1...");
        threadC1.start();

        // Letting threads execute for a short time
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        // Interrupting B1 to see the effect
        threadB1.interrupt();

        // Ensuring all threads finish before exiting main
        try {
            threadA1.join();
            threadB1.join();
            threadC1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted during join: " + e);
        }

        System.out.println("All threads have finished execution.");
    }
}