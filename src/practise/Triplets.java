package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Triplets {
    public Map<Integer, ArrayList<Integer>> findTriplets(int[] array) {
        Map<Integer, ArrayList<Integer>> triplets = new HashMap<>();
        for(int i=0; i<array.length-2; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            if(array[i]+array[i+1] == array[i+2]) {
                arrayList.add(array[i]);
                arrayList.add(array[i+1]);
                arrayList.add(array[i+2]);
                triplets.put(array[i]+array[i+1], arrayList);
            }
        }
        return triplets;
    }
}
