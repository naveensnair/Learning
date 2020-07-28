package practise;

import arrays.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public ArrayList<ArrayList<Integer>> findTwoSum(int[] array, int sum) {

        Map<Integer, ArrayList<ArrayList<Integer>>> twoSumMap = new HashMap<>();
        ArrayList<ArrayList<Integer>> currentArrayList;
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                int currentSum = array[i] + array[j];
                if(currentSum == sum) {
                    ArrayList<Integer> tempArrayList = new ArrayList<>();
                    tempArrayList.add(array[i]);
                    tempArrayList.add(array[j]);
                    if(twoSumMap.get(currentSum) != null) {
                        currentArrayList = twoSumMap.get(currentSum);
                    } else {
                        currentArrayList = new ArrayList<>();
                    }
                    currentArrayList.add(tempArrayList);
                    twoSumMap.put(sum, currentArrayList);
                }
            }
        }
        return twoSumMap.get(sum);
    }
}
