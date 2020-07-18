package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Array implements IArrey {
    private int size = 10;
    public int[] list = new int[size]; //fixed array
    public ArrayList<Integer> arrayList = new ArrayList<>();// dynamic array

    @Override
    public void inertFixedArray(int value, int pos){
        try {
            if(pos < size) {
                list[pos] = value;
            } else {
                throw new IndexOutOfBoundsException("Array is already full");
            }
        } catch (Exception e) {
            Logger.getGlobal().log(Level.WARNING, e.getMessage());
        }
    }

    @Override
    public void insertDynamicArray(int value) {
        arrayList.add(value);
    }

    @Override
    public int[] getFixedArray() {
        return list;
    }

    @Override
    public ArrayList<Integer> getDynamicArray() {
        return arrayList;
    }

    @Override
    public void populateFixedArray() {
        for(int i=0; i<5; i++) {
            inertFixedArray(i+5, i);
        }
        System.out.println("List : " + list);
    }

    @Override
    public void populateDynamicArray() {
        for(int i=0; i<100; i=i+10) {
            insertDynamicArray(i);
        }
    }

    @Override
    public boolean searchElementInFixedArray(int value) {
        if(list.length > 0) {
            for(int i=0; i<list.length; i++) {
                if(list[i] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean searchElementInDynamicArray(int value) {
        if(arrayList.size() > 0) {
            for (Integer val : arrayList) {
                if (val == value) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int[] insertIntoCertainPositionFixedArray(int value, int position) {
            if(list.length < position) {
                return list;
            } else {
                for(int i=list.length-2; i>=position-1; i--) {
                    list[i+1] = list[i];
                }
                list[position-1] = value;
            }
            return list;
    }

    @Override
    public ArrayList<Integer> insertIntoCertainPositionDynamicArray(int value, int position){
        arrayList.add(position-1, value);
        return arrayList;
    }

    @Override
    public int[] deleteElementFromFixedArray(int value) {
        int size = list.length;
        int indexOfElementToBeDeleted = 0;
        for(int i=0; i<size; i++) {
            if(list[i] == value) {
                indexOfElementToBeDeleted = i;
                break;
            }
        }
        for(int i=indexOfElementToBeDeleted; i<size-1; i++) {
            if(indexOfElementToBeDeleted+1 == size) {
                list[indexOfElementToBeDeleted] = 0;
            } else {
                list[i] = list[i+1];
            }
        }
        return list;
    }

    @Override
    public ArrayList<Integer> deleteElementFromDynamicArray(int value) {
        int index = arrayList.indexOf(value);
        arrayList.remove(index);
        return arrayList;
    }

    @Override
    public boolean checkIfFixedArrayIsSorted() {
        for(int i=0; i<list.length; i++) {
            if(list[i] > list[i+1]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkIfDynamicArrayIsSorted() {
        for(int i=0; i<arrayList.size()-1; i++) {
            if(arrayList.get(i) > arrayList.get(i+1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int[] reverseFixedArray() {
        int size = list.length;
        int low = 0;
        int high = size - 1;
       while(low < high) {
            int temp = list[low];
            list[low] = list[high];
            list[high] = temp;
            low++;
            high--;
        }
        return list;
    }

    @Override
    public ArrayList<Integer> reverseDynamicArray() {
        int low=0;
        int high=arrayList.size()-1;
        while(low < high) {
            int temp = arrayList.get(low);
            arrayList.set(low, arrayList.get(high));
            arrayList.set(high, temp);
            low++;
            high--;
        }
        return arrayList;
    }

    @Override
    public int removeDuplicatesFromSortedArray(int[] array){
        int[] list = array;
        //sort the array first if unsorted array is given
        Arrays.sort(list);

        //now remove the duplicates
        int result = 1;
        for(int i=1; i<list.length; i++) {
            if(list[i] != list[result-1]) {
                list[result] = list[i];
                result++;
            }
        }
        return result;
    }

    @Override
    public int[] rotateArrayByOne(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temp;
        return array;
    }

    @Override
    public int[] reverseArrayForRotationByNTimes(int[] array, int low, int high) {
        while(low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
        return array;

    }
    @Override
    public int[] rotateArrayByNTimes(int[] array, int times) {
        /*for(int i=0; i<times; i++) {
            array = rotateArrayByOne(array);
        }
        return array;*/
        //rotate until n
        array = reverseArrayForRotationByNTimes(array, 0, times-1);
        //rotate from n to length-1
        array = reverseArrayForRotationByNTimes(array, times, array.length-1);
        //rotate the whole new array
        array = reverseArrayForRotationByNTimes(array, 0, array.length-1);
        return array;
    }

    @Override
    public int[] getLeadersInArray(int[] array) {
        int index = 0;
        int[] leadersArray = new int[array.length-1];
        leadersArray[0] = array[array.length-1];
        int currentLeader = array[array.length-1];
        for(int i=array.length-2; i>=0; i--) {
            if(currentLeader < array[i]) {
                currentLeader = array[i];
                ++index;
                leadersArray[index] = currentLeader;
            }
        }
        return leadersArray;
    }

    @Override
    public int maxDiffInArray(int[] array) {
        int result = array[1] - array[0];
        int minValue = array[0];
        for(int i=1; i<array.length; i++) {
            result = Math.max(result, array[i]-minValue);
            minValue = Math.min(minValue, array[i]);
        }
        return result;
    }
    @Override
    public int maxProfit(int[] price, int start, int end) {
        if(end <= start) {
            return 0;
        } else {
            int profit = 0;
            for(int i=start; i<end; i++) {
                for(int j=i+1; j<=end; j++) {
                    int current_profit = price[j] - price[i]
                            + maxProfit(price, start, i-1)
                            + maxProfit(price, j+1, end);
                    profit = Math.max(profit, current_profit);
                }
            }
            return profit;
        }
    }

    @Override
    public int maxProfitNew(int[] price) {
        int size = price.length;
        int profit = 0;
        for(int i=1; i<size; i++) {
            if(price[i] > price[i-1]) {
                profit += price[i] - price[i-1];
            }
        }
        return profit;
    }

    @Override
    public int trappingWater(int[] array) {
        int size = array.length;
        int[] lmax = new int[array.length];
        int[] rmax = new int[array.length];
        lmax[0] = array[0];
        rmax[size-1] = array[size-1];
        int result = 0;
        for(int i=1; i<size; i++) {
            rmax[i] = Math.max(array[i], array[i-1]);
        }
        for(int i=size-2; i>=0; i--) {
            lmax[i] = Math.max(array[i], array[i+1]);
        }

        for(int i=1; i<size-1; i++){
            result += Math.min(lmax[i], rmax[i]) - array[i];
        }
        return result;
    }
}