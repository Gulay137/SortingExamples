package bubble;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};

        System.out.println("Original Array:");
        displayArray(arr);

        BubbleSort(arr);

        System.out.println("Sorted Array:");
        displayArray(arr);
    }

    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
 public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
      }
}
