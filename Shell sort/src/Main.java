import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 8, 3, 7, 5, 6, 4, 1};

        System.out.println(Arrays.toString(array));

        shellSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {

                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr [j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
}