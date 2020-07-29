package practise;

public class KandanesAlgorithm {
    public int finMaxContinuousSubArray(int[] array) {
        int max_so_far = 0;
        int max_ending_here = 0;
        for(int i=0; i<array.length; i++) {
            max_ending_here = array[i] + max_ending_here;
            if(max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
