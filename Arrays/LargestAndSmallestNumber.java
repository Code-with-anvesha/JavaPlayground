public class LargestAndSmallestNumber {
   
    public static int largestNumber( int arr[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static int SmallestNumber( int arr[]) {
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(Smallest>arr[i]){
                Smallest=arr[i];
            }
        } 
        return Smallest;
    }
    public static void main(String[] args) {
        int array[]={1,2,6,8,5,10,12,18,23,0};
        System.out.println("Largest Number: " + largestNumber(array));
        System.out.println("Smallest Number: " + SmallestNumber(array));
    }
}
