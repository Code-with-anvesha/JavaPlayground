

public class BinarySearch {
   public static int binarySearch(int arr[], int key) {
       int start=0 , end=arr.length-1;
       while(start<=end){
           int mid = (start + end)/2;
           // comparisons
           if(arr[mid]==key){
               return mid;
           }
           if(arr[mid]<key){
               start=mid+1;
           } else{
               end = mid-1;
           }
       }
       return -1;
   }

   public static void main(String[] args) {
       int array[]={2,4,6,8,9,22,14};
       int key=22;
       int index =binarySearch(array,key);

       if(index != -1){
           System.out.println("Element "+ key + " is " + index + " position");
       }else{
           System.out.println("Element "+ key + " is not found!");
       }
   }
}
