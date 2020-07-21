import arrays.Array;
import arrays.IArrey;
import hashing.CustomHashMap;
import hashing.CustomHashSet;
import linkedlist.CustomLinkedList;
import queue.CustomQueue;
import queue.StackQueue;
import searching.BinarySearch;
import searching.ISearch;
import stack.CustomStack;
import stack.LinkedListStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;

public class Datastructures {

    public static void main(String[] args) {
        //arrayFunctions();
        //searchFunctions();
        //linkedListFunctions();
        //stackFunctionalities();
        //queueFunctionalities();
        HashingFunctionalities();
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
}
