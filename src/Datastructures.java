import arrays.Array;
import arrays.IArrey;

import java.util.ArrayList;
import java.util.Arrays;

public class Datastructures {

    public static void main(String[] args) {
        arrayFunctions();
    }

    private static void arrayFunctions() {
        IArrey array = new Array();
        array.populateFixedArray();
        int [] arr = array.getFixedArray();
        System.out.println("List : " + Arrays.toString(arr));


        array.populateDynamicArray();
        ArrayList<Integer> arrList = array.getDynamicArray();
        System.out.println("Array list : " + arrList);

        boolean found = array.searchElementInFixedArray(7);
        System.out.println("Is 7 found in fixed array ? " + found);

        boolean foundInList = array.searchElementInDynamicArray(30);
        System.out.println("Is 30 found in dynamic array ? " + foundInList);

        int[] arrayAfterInsert = array.insertIntoCertainPositionFixedArray(19, 6);
        System.out.println("New size after insertion : " + Arrays.toString(arrayAfterInsert));

        ArrayList<Integer> arrayListAfterInsert = array.insertIntoCertainPositionDynamicArray(19, 11);
        System.out.println("New array list after insertion : " + arrayListAfterInsert);

        int[] arrayAfterDelete = array.deleteElementFromFixedArray(19);
        System.out.println("Recovered array : " + Arrays.toString(arrayAfterDelete));

        ArrayList<Integer> arrayListAfterDeletion = array.deleteElementFromDynamicArray(19);
        System.out.println("Recovered array list : " + arrayListAfterDeletion);

        boolean isFixedArraySorted = array.checkIfFixedArrayIsSorted();
        System.out.println("Is fixed array sorted : " + isFixedArraySorted);

        boolean isDynamicArraySorted = array.checkIfDynamicArrayIsSorted();
        System.out.println("Is Dynamic array sorted : " + isDynamicArraySorted);

        int[] reversedFixedArray = array.reverseFixedArray();
        System.out.println("Reversed fixed array : " + Arrays.toString(reversedFixedArray));

        ArrayList<Integer> reversedDynamicArray = array.reverseDynamicArray();
        System.out.println("Reversed dynamic array : " + reversedDynamicArray);


        int[] myArray = new int[]{10,20,40,50,60,20,30,70,70,90};
        int nonDuplicateArraySize = array.removeDuplicatesFromSortedArray(myArray);
        System.out.println("Non duplicate sorted array size : " + nonDuplicateArraySize);

        int[] rotatedArrayByOne = array.rotateArrayByOne(myArray);
        System.out.println("Rotated array by one position : " + Arrays.toString(rotatedArrayByOne));

        int[] myUnrelatedArray = new int[]{10,20,30,40,50,60,70,80,90};
        int[] rotatedArrayByNTimes = array.rotateArrayByNTimes(myUnrelatedArray, 3);
        System.out.println("Rotated array by 3 times : " + Arrays.toString(rotatedArrayByNTimes));

        int[] findLeadersArray = new int[]{10,7,6,5,10,8,4,2,3};
        int[] leadersArray = array.getLeadersInArray(findLeadersArray);
        System.out.println("Leaders array : " + Arrays.toString(leadersArray));

        int[] maxDiffArray = new int[]{2,8,4,7,12,9};
        int maximumDifference = array.maxDiffInArray(maxDiffArray);
        System.out.println("Maximum difference in the given array : " + maximumDifference);

        int[] price = new int[]{1,5,3,8,12};
        int maxProfit = array.maxProfit(price, 0, price.length-1);
        System.out.println("Maximum profit : " + maxProfit);

        int maxProfitNew = array.maxProfitNew(price);
        System.out.println("Maximum profit new : " + maxProfitNew);

        int[] water = new int[]{5,0,6,2,3};
        int capacity = array.trappingWater(water);
        System.out.println("Capacity remaining to fill : " + capacity);
    }

}
