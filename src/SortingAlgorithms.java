
public class SortingAlgorithms {

    public static Integer[] bubbleSort(Integer[] array) {
        boolean swapped = false;
        int temp;
        for (int j = 0; j < array.length; ++j) {
            for (int i = 0; i < array.length - j - 1; ++i) {
                if (array[i + 1] < array[i]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
                if (!swapped) break;
            }
        }
        return array;
    }

    public static Integer[] quickSort(Integer[] arr) {
        return quickSort(arr, 0, arr.length-1);
    }
    private static Integer[] quickSort(Integer[] arr, int st, int end) {
        int pivot = arr[(st + end) /2];
        int i = st;
        int j = end;
       while (i <= j) {
           while (arr[i] < pivot) i++;
           while (arr[j] > pivot) j--;

           if (i <= j) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }
       }
         if (st < j) quickSort(arr, st, j);
         if (i < end) quickSort(arr, i, end);

        return arr;
    }
}
