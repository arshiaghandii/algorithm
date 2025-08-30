public class Main {
    public static void main(String[] args) {
        int[] Array_unSorted = {5,4,9,3,7,2,5,3,5,6,2,4};
        for (int i = 1; i < Array_unSorted.length; i++) {
            int temp = Array_unSorted[i];
            int j = i - 1;
            while (j >= 0 && Array_unSorted[j] > temp) {
                Array_unSorted[j + 1] = Array_unSorted[j];
                j--;
            }
            Array_unSorted[j + 1] = temp;
        }
        for (int num : Array_unSorted) {
            System.out.print(num + " ");
        }
    }
}
