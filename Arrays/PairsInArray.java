public class PairsInArray {

    public static int pairsInArray(int array[]) {
        int tp=0;
        for(int i=0; i<array.length; i++){
            // System.out.println("" + array[i]);
            for(int j=i+1; j<array.length; j++){
               System.out.print("(" + array[i] +","+ array[j] + ") ");
               tp++;
            }
            System.out.println();
        }
        return tp;
    }

    public static void main(String[] args) {
        int array[] = {2,4,6,8,10}; 
        int totalPairs=pairsInArray(array);
        System.out.println("Total Pairs: "+totalPairs);   
    }
}