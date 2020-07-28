package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ThreeSum {
    Map<Integer, ArrayList<ArrayList<Integer>>> twoSumMap = new HashMap<>();
    ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
    ArrayList<ArrayList<Integer>> currentList;

    public ArrayList<ArrayList<Integer>> findThreeSum(int[] array, int sum) {
        populateTwoSum(array);
        return findThreeSumArray(array, sum);
    }

    private void populateTwoSum(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                int sum = array[i] + array[j];
                ArrayList<Integer> tempArrayList = new ArrayList<>();
                tempArrayList.add(array[i]);
                tempArrayList.add(array[j]);
                if(twoSumMap.get(sum) == null) {
                    currentList = new ArrayList<>();
                } else {
                    currentList = twoSumMap.get(sum);
                }
                currentList.add(tempArrayList);
                twoSumMap.put(sum, currentList);
            }
        }
    }

    private ArrayList<ArrayList<Integer>> findThreeSumArray(int[] array, int sum){
        for (int value : array) {
            if (twoSumMap.get(sum - value) != null) {
                for (ArrayList<Integer> list : twoSumMap.get(sum - value)) {
                    list.add(value);
                    finalList.add(list);
                }
            }
        }
        return finalList;
    }
}
