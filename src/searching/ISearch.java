package searching;

public interface ISearch {

    int findElement(int[] array, int value);

    int findElementRecursive(int[] array, int low, int high, int value);

    int findFirstOccurence(int[] array, int value);
}
