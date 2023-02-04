
/**
 * Rearrange_Array_elements
 */
import java.util.Arrays;

public class Rearrange_Array_elements {

    public static void main(String[] args) {
        long arr[] = { 1, 2, 3, 4, 5 };
        rearrange(arr, arr.length);

    }

    public static void rearrange(long arr[], int n) {
        int start = 0;
        int end = arr.length - 1;

        long result[] = new long[n];
        int i = 0;
        while (start < end) {
            result[i] = arr[end];// result[i++]
            i++;
            result[i] = arr[start];
            i++;
            start++;
            end--;

        }
        if (arr.length % 2 != 0) {
            result[i] = arr[start];
        }
        System.out.println(Arrays.toString(result));
        // result[i]=arr[start];
        for (int j = 0; j < n; j++) {
            arr[j] = result[j];
        }
        // System.out.println();

    }
}