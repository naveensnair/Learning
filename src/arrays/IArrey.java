package arrays;

import java.util.ArrayList;

public interface IArrey {
    void inertFixedArray(int value, int pos);

    void insertDynamicArray(int value);

    int[] getFixedArray();

    ArrayList<Integer> getDynamicArray();

    void populateFixedArray();

    void populateDynamicArray();

    boolean searchElementInFixedArray(int value);

    boolean searchElementInDynamicArray(int value);

    int[] insertIntoCertainPositionFixedArray(int value, int position);

    ArrayList<Integer> insertIntoCertainPositionDynamicArray(int value, int position);

    int[] deleteElementFromFixedArray(int value);

    ArrayList<Integer> deleteElementFromDynamicArray(int value);

    boolean checkIfFixedArrayIsSorted();

    boolean checkIfDynamicArrayIsSorted();

    int[] reverseFixedArray();

    ArrayList<Integer> reverseDynamicArray();

    int removeDuplicatesFromSortedArray(int[] array);

    int[] rotateArrayByOne(int[] array);

    int[] reverseArrayForRotationByNTimes(int[] array, int low, int high);

    int[] rotateArrayByNTimes(int[] array, int times);

    int[] getLeadersInArray(int[] array);

    int maxDiffInArray(int[] array);

    int maxProfit(int[] price, int start, int end);

    int maxProfitNew(int[] price);

    int trappingWater(int[] array);

    int maximumConsecutiveOnes(int[] array);

    int maxSubArray(int[] array);

    int longestEvenOddSubArray(int[] array);

    int maximumCircularSubArray(int[] array);

    int findMajority(int[] array);
}
