import javax.lang.model.element. Element;

public class PrintSubarray {
     
    public static void printSubarrays(int array[]) {
        int smallest =Integer.MAX_VALUE , largest=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum=0;
                System.out.print("{ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    sum+=array[k];
                }
                largest=Math.max(sum,largest);
                smallest=Math.min(sum,smallest);
                System.out.print("}  ");
            }
            System.out.println();
        }
        System.out.println("Smallest sum of Subarray: " + smallest);
        System.out.println("Largest sum of Subarray: " + largest);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        printSubarrays(array);
    }
}