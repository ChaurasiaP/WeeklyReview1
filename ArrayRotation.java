package Review1;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int size = arr.length;

        // 1 2 3 4 5 6
        // 6 1 2 3 4 5

        int temp = arr[size - 1];  // store the last element

        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;    // last element will be the first index
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
