
 public class LargestNumber {
    public static int largestNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int array[] ={1, 2, 10, 3, 11, 16};
        System.out.println("Largest value is : "+largestNumber(array));
    }
}
