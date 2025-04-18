public class MaxSubarraySum {

    public static void maxSubarraySum(int array[]) {
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[array.length];
        prefix[0] =  array[0];

        // Calculate prifixArray
        for(int i=1; i<array.length; i++){
            prefix[i] = array[i] + prefix[i-1];
        }

        // calculate Max Subarray Sum

        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                int  curSum = i == 0  ? prefix[j] : prefix[j]-prefix[i-1];
                if (max < Sum) {
                    max = Sum;

        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                int  Sum= i==0? prefix[j] : prefix[j]-prefix[i-1];
                if (max<Sum) {
                    max=Sum;
                }
            }
        }
        System.out.println("Max Subarray Sum: " + max);
    }

    public static void main(String[] args) {
        int array[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(array);
    }

}
