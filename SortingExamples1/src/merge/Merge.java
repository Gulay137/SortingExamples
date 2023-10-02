package merge;

public class Merge {
       public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};

       
        System.out.println("Array before sorting:");
        showArray(arr);

        performMergeSort(arr);

 
        System.out.println("\nArray after sorting:");
        showArray(arr);
    }

     public static void performMergeSort(int[] array) {
        int len = array.length;
        int[] temp = new int[len];
        int step;

      for (step = 1; step < len; step *= 2) {
            for (int left = 0; left < len - 1; left += 2 * step) {
                int mid = Math.min(left + step - 1, len - 1);
                int right = Math.min(left + 2 * step - 1, len - 1);

            
                mergeArrays(array, temp, left, mid, right);
            }
         }
    }
  public static void mergeArrays(int[] arr, int[] temp, int leftStart, int middle, int rightEnd) {
         int leftEnd = middle;
         int rightStart = middle + 1;
         int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int current = leftStart;


          while (left <= leftEnd && right <= rightEnd) {
            if (arr[left] <= arr[right]) {
                temp[current++] = arr[left++];
            } else {
                temp[current++] = arr[right++];
            }
        }

       
         while (left <= leftEnd) {
            temp[current++] = arr[left++];
        }

        while (right <= rightEnd) {
            temp[current++] = arr[right++];
            }

      
         System.arraycopy(temp, leftStart, arr, leftStart, size);
    }
 
      public static void showArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
       }
} 