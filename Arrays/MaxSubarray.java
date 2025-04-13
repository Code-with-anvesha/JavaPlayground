public class MaxSubarray {
 
    
    public static void MaxSubarra(int array[]){


        int max = Integer.MIN_VALUE;
        int perfix[] = new int [array.length];    
        perfix[0] array[0];

        for (int i = 1; i < array.length; i++){

            perfix[i] = array[i] + perfix[i -1];
        }

        for ( int i = 0; i < array.length; i++){

            for ( int j = 1; i < array.length; j++){

                int sum = i==0 ? perfix[j] : perfix[j]-perfix[i-1];



                if (max<sum){
                    max = sum;

                }
        }
    }


    System.out.println("Max Subarray:" + max);

}


public static void main(String[] args) {
    
    int array[] = {1,-3, 6, -4, 2};

    MaxSubarray(array);
}
}