package strings;

public class StringFunctions {
    public String reverseString(String value) {
        char[] array = value.toCharArray();
        int start = 0;
        for(int end = 0; end<array.length; end++){
            if(array[end] == ' ') {
                reverse(array, start, end-1);
                start = end++;
            }
        }
        reverse(array, start, array.length-1);
        reverse(array, 0, array.length-1);
        return new String(array);

    }

    private char[] reverse(char[] name, int low, int high){
        while (low <= high) {
            char temp = name[low];
            name[low] = name[high];
            name[high] = temp;
            low++;
            high--;
        }
        return name;
    }
}
