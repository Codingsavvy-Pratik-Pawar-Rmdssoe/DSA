import java.util.Scanner;

class countSwaps {

    public static int bubbleSortWithSwapCount(int[] arr) {
        int swaps = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       int totalSwaps = bubbleSortWithSwapCount(arr);

      System.out.println("Sorted array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println("\nTotal swaps = " + totalSwaps);

        sc.close();
    }
}