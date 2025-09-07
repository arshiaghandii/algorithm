class MergeSort {

    // متد تقسیم که قبلاً نوشتیم
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int middle = array.length / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[array.length - middle];
        System.arraycopy(array, 0, leftHalf, 0, middle);
        System.arraycopy(array, middle, rightHalf, 0, array.length - middle);

        sort(leftHalf);
        sort(rightHalf);
        merge(array, leftHalf, rightHalf);
    }

    private void merge(int[] originalArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                originalArray[k] = leftHalf[i];
                i++;
            } else {
                originalArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            originalArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            originalArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();
        int[] data = {3, 8, 5, 3, 7, 8, 9, 2, 5, 1, 2, 1, 2, 3, 2, 3, 1};

        System.out.println("آرایه اولیه: " + java.util.Arrays.toString(data));

        sorter.sort(data);

        System.out.println("آرایه مرتب‌شده: " + java.util.Arrays.toString(data));
    }
}