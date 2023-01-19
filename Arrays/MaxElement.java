import java.rmi.StubNotFoundException;

public class MaxElement {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 8, -1, -2 };

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
