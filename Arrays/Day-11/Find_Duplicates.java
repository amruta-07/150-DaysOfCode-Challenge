
public class Find_Duplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 5, 3, 2 };
        // int ans = duplicateElement(arr);
        // System.out.println(ans);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.print(arr[j] + ",");
                }
            }
        }

    }

    // public static int duplicateElement(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if ((arr[i] == arr[j]) && (i != j)) {
    // return arr[j];
    // }
    // }
    // }
    // return -1;
    // }
}
