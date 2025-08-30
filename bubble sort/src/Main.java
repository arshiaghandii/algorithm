public class Main {
    public static void main(String[] args) {
        int[] arrays = {1, 5, 7, 5, 4, 3, 6, 4, 3};

        for (int j = 0; j < arrays.length - 1; j++) {
            for (int i = 0; i < arrays.length - j - 1; i++) {
                if (arrays[i] > arrays[i + 1]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = temp;
                }
            }
        }

        for (int num : arrays) {
            System.out.print(num + " ");
        }
    }
}
