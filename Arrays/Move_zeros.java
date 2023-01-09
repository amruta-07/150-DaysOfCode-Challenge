public class Move_zeros {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 0, 1, 9, 0, 12, 87, 0 };
        int non_zero = 0;
        for (int start = 0; start < arr.length; start++) {
            if (arr[start] != 0) {
                arr[non_zero] = arr[start];
                non_zero++;
            }
        }
        for (int end = non_zero; end < arr.length; end++) {
            arr[end] = 0;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}
