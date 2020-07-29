import arrays.Array;
import arrays.IArrey;
import hashing.CustomHashMap;
import hashing.CustomHashSet;
import linkedlist.CustomLinkedList;
import practise.*;
import queue.CustomQueue;
import queue.StackQueue;
import searching.BinarySearch;
import searching.ISearch;
import sorting.ArraysSort;
import sorting.ComparableSorting;
import sorting.ComparatorSorting;
import stack.CustomStack;
import stack.LinkedListStack;
import strings.StringFunctions;

import java.util.*;

public class Datastructures {

    public static void main(String[] args) {
        //arrayFunctions();
        //searchFunctions();
        //linkedListFunctions();
        //stackFunctionalities();
        //queueFunctionalities();
        //HashingFunctionalities();
        //Sorting();
        //StringFun();
        //twoSuProblems();
        //threeSumProblem();
        //geeksIPAddress();
        //ipAddressGenerator();
        //continuousSubArray();
        //triplets();
        //kandanes();
        //missingNumberInArray();
        //rotateLinkedList();
        rotateCustomLinkedList();

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

        int[] booleanArray = new int[]{1,0,1,1,1,1,0,1,1,1};
        int maxCountOfOne = array.maximumConsecutiveOnes(booleanArray);
        System.out.println("Maximum consecutive ones : " + maxCountOfOne);

        int[] kandanAlgoArray = new int[]{-3,8,-2,4,-5,6};
        int maxOfSubArray = array.maxSubArray(kandanAlgoArray);
        System.out.println("Maximum subarray count : " + maxOfSubArray);

        int[] oddEvenArray = new int[]{5,10,20,6,3,8};
        int maxOddEvenCombination = array.longestEvenOddSubArray(oddEvenArray);
        System.out.println("Maximum possible combination : " + maxOddEvenCombination);

        int[] normalArray = new int[]{10,5,-5};
        int maxCircularSubArray = array.maximumCircularSubArray(normalArray);
        System.out.println("Maximum circular subarray : " + maxCircularSubArray);

        int[] majorityArray = new int[]{8,3,4,8,8,8,9,3,8};
        int majority = array.findMajority(majorityArray);
        System.out.println("Majority from array : " + majority);
    }
    private static void searchFunctions() {
        ISearch search = new BinarySearch();

        int[] array = new int[]{10,20,30,40,50,60,70,80};
        int index = search.findElement(array, 20);
        System.out.println("Index of the searched element : " + index);

        int recurIndex = search.findElementRecursive(array, 0, array.length-1, 60);
        System.out.println("Index of searched element recursively : " + recurIndex);

        int[] newArray = new int[]{10,15,20,30,20,50,20};
        int findIndexOfFirstOccurence = search.findFirstOccurence(newArray, 20);
        System.out.println("First occurence : " + findIndexOfFirstOccurence);
    }

    private static void linkedListFunctions() {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertBegin(20);
        linkedList.insertBegin(10);
        linkedList.insertBegin(5);
        linkedList.insertAtEnd(30);
        linkedList.middleOfLinkedListNaive();
        linkedList.middleLinkedListBest();
        //linkedList.reverseLinkedList();
        linkedList.reverseLinkedListInOneTraversal();
        //linkedList.printLinkedList();
        //linkedList.printNthFromEnd(2);
    }

    private static void stackFunctionalities() {
        CustomStack stack = new CustomStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Top element is : " + stack.pop());
        LinkedListStack llStack = new LinkedListStack();
        llStack.push(20);
        llStack.push(50);
        llStack.push(70);
        llStack.pop();
        boolean isBalanced = stack.balancedParanthesisWithAString("{[()]}");
        System.out.println("isBalanced : " + isBalanced);

    }

    private static void queueFunctionalities() {
        /*CustomQueue queue = new CustomQueue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(50);
        System.out.println("Front is : " + queue.getFront());
        System.out.println("Deque is : " + queue.deQueue());*/
        StackQueue queue = new StackQueue();
        queue.push(5);
        queue.push(10);
        queue.push(15);
        queue.push(25);
        System.out.println("expected 25 since pop is used : " + queue.pop());
    }

    private static void HashingFunctionalities() {
       /* CustomHashSet hashSet = new CustomHashSet();
        hashSet.addNames();
        boolean isNameFound = hashSet.isNameFound("Naveen");
        System.out.println("Is name found : " + isNameFound);*/


        CustomHashMap hashMap = new CustomHashMap();
        hashMap.addNames();
    }

    private static void Sorting() {
        ArraysSort sort = new ArraysSort();
        sort.arraySorting();
        ComparableSorting cs = new ComparableSorting();
        cs.sortingUsingComparable();
        ComparatorSorting css = new ComparatorSorting();
        css.customComparator();
    }

    private static void StringFun(){
        StringFunctions stringFunctions = new StringFunctions();
        String str = stringFunctions.reverseString("All the best");
        System.out.println(str);
    }

    private static void twoSuProblems() {
        TwoSum twoSum = new TwoSum();
        int[] array = new int[]{1,0,-1,2,-2};
        ArrayList<ArrayList<Integer>> combinations = twoSum.findTwoSum(array, 0);
        for(ArrayList<Integer> originalArray : combinations) {
            for (Integer integer : originalArray) {
                System.out.println(integer);
            }
        }
    }

    private static void threeSumProblem() {
        ThreeSum threeSum = new ThreeSum();
        int[] array = new int[]{7, 12, 3, 1, 2, -6, 5, -8, 6};
        ArrayList<ArrayList<Integer>> combinations = threeSum.findThreeSum(array, 0);
        for(ArrayList<Integer> originalArray : combinations) {
            System.out.println("\n[");
            for(Integer integer : originalArray) {
                System.out.print(integer + " ");
            }
            System.out.print("]");
        }
    }

    private static void geeksIPAddress() {
        GeekIpAdresses ipAdresses = new GeekIpAdresses();
        System.out.println(ipAdresses.restoreIpAddresses("25525511135").toString());
    }

    private static void ipAddressGenerator() {
        IPAddressGenerator ipAddressGenerator = new IPAddressGenerator();
        System.out.println(ipAddressGenerator.generateIpAddress("25525511135").toString());
    }

    private static void continuousSubArray() {
        ContinuousSubArray subArray = new ContinuousSubArray();
        subArray.findContinuousSubArray(new int[]{1,0,2,5,1,6,3}, 9);
    }

    private static void triplets() {
        Triplets triplets = new Triplets();
        Map<Integer, ArrayList<Integer>> newTriplets = triplets.findTriplets(new int[]{1,2,3,5,8,0,8});
        for(ArrayList<Integer> integers : newTriplets.values()) {
            System.out.println(integers.toString());
        }
    }

    private static void kandanes(){
        KandanesAlgorithm kandanesAlgorithm = new KandanesAlgorithm();
        int max = kandanesAlgorithm.finMaxContinuousSubArray(new int[] {-2, -3, 4, -1, -2, 1, 5, -3});
        System.out.println(max);
    }

    private static void missingNumberInArray(){
        MissingElementInArray missingElementInArray = new MissingElementInArray();
        int num = missingElementInArray.findMissingElement(new int[]{1,2,3,4,5,6,7,8,10});
        System.out.println(num);
    }

    private static void rotateLinkedList() {
        RotateLinkedListNTimes rotateLinkedListNTimes = new RotateLinkedListNTimes();
        rotateLinkedListNTimes.rotate(2);
    }

    private static void rotateCustomLinkedList() {
        CustomLlinkedListRotate customLlinkedListRotate = new CustomLlinkedListRotate();
        customLlinkedListRotate.insertBegin(10);
        customLlinkedListRotate.insertBegin(20);
        customLlinkedListRotate.insertBegin(30);
        customLlinkedListRotate.insertBegin(40);
        customLlinkedListRotate.insertBegin(50);
        //customLlinkedListRotate.insertBegin(60);
        customLlinkedListRotate.printTheLinkedList();
        customLlinkedListRotate.rotateNTimes(2);
    }
}
