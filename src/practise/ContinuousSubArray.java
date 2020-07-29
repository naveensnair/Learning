package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class ContinuousSubArray {
    public ArrayList<ArrayList<Integer>> findContinuousSubArray(int[] array, int sum) {
        ArrayList<ArrayList<Integer>> finalSubArray = new ArrayList<>();
        for(int i=0; i<array.length-1; i++) {
            ArrayList<Integer> subArray = new ArrayList<>();
            int tempTotal = 0;
            for(int j=i+1; j<array.length; j++) {
                if(j > i+1) {
                    tempTotal += array[j];
                } else {
                    tempTotal = array[i] + array[j];
                }
                if(tempTotal > sum) {
                    break;
                } else if(sum == tempTotal) {
                    for(int k=i; k<=j; k++) {
                        subArray.add(array[k]);
                    }
                    finalSubArray.add(subArray);
                }
            }
        }
        System.out.println("array = " + Arrays.toString(finalSubArray.toArray()) + ", sum = " + sum);
        return finalSubArray;
    }
}
