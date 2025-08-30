public class SelectionSortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 6, 7, 1, 5, 9, 4, 7, 3, 8};

        // Selection Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + "");
        }
    }
}
