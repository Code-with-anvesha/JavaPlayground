import java.util.*;

class Sum {
    static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int num1 = obj.nextInt();
        int num2 = obj.nextInt();

        int x = sum(num1, num2);
        System.out.println("Sum = " + x);

        obj.close(); // Closing scanner to prevent memory leak
    }
}