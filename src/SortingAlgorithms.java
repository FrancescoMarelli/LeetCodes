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
       //
        return arr;
    }

    Integer[] twoSum(Integer[] nums, int target) {
        Integer[] sumVector = new Integer[]{};
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        sumVector[0] = i;
                        sumVector[1] = j;
                        break;
                    }
                }
            }
        }
        return sumVector;

    }
}
