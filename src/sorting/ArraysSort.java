package sorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public void arraySorting() {
        int[] arr1 = new int[]{10,50,20,40,40,70,60};
        char[] arr2 = new char[]{'z','c','e','b'};
        Arrays.sort(arr1, 1,3);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
