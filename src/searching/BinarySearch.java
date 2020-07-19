package searching;



public class BinarySearch implements ISearch {


    public int findElement(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int findElementRecursive(int[] array, int low, int high, int value) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (array[mid] == value) {
            return mid;
        } else if (array[mid] > value) {
            return findElementRecursive(array, low, mid - 1, value);
        } else {
            return findElementRecursive(array, mid + 1, high, value);
        }
    }

    public int findFirstOccurence(int[] array, int value) {
        int low = 0;
        int high = array.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(array[mid] > value) {
                high = mid-1;
            } else if(array[mid] < value) {
                low = mid+1;
            } else {
                if(mid == 0 || array[mid-1] != array[mid]) {
                    return mid;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}