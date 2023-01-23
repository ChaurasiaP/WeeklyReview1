package Review1;

public class NonRepeating {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 1, 2};
        int size = a.length;

        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count <= 1) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
