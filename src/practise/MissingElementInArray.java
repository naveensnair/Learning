package practise;

public class MissingElementInArray {
    public int findMissingElement(int[] array) {
        int sum=1;
        for(int i=2; i<=(array.length+1); i++) {
            sum += i;
            sum -= array[i-2];
        }
        return sum;
    }
}
