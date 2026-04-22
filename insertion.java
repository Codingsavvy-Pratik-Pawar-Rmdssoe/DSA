
class insertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 8, 1, 4};

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            if (arr[i] % 2 == 0) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] % 2 == 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                arr[j + 1] = key;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}