class MathOperation {
    static double mul(double x, double y) {
        return x * y;
    }

    static double div(double x, double y) {
        if (y == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return x / y;
    }
}

public class Static_method {
    public static void main(String[] args) {
        double m = MathOperation.mul(10.2, 5.2);
        double d = MathOperation.div(2.2, 2.2);
        System.out.println("Product is: " + m);
        System.out.println("After divide: " + d);
    }
}