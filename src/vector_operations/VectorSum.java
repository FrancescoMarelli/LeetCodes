package vector_operations;

/*
    LeetCode: https://leetcode.com/problems/two-sum/description/
    Return the indices of the elements which sum == target
 */
public class VectorSum {

    private static final int MAX_LENGTH = 10000;
    private static final int MIN_LENGTH = 2;
    private static final int LIMIT_VALUE = 1000000000;

    public static void main(String[] s) {
       int target = 10;
       Integer[] input = {1,2,4,5,6,7,2,2,12,2,43,2,421};
       VectorSum v = new VectorSum();
       Integer[] output = v.twoSum(input, target);
       for(Integer i : output)
            System.out.println(i);
    }
    Integer[] twoSum(Integer[] nums, int target) {
        validateTarget(target);
        validateArray(nums);
        Integer[] sumVector = new Integer[2];
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

    private void validateArray(Integer[] arr) {
        if (arr.length > MAX_LENGTH || arr.length <= MIN_LENGTH) {
            throw new IllegalArgumentException("Array size is incorrect, has to be between 2 and 10000 elements");
        }
        for (Integer i : arr) {
            if (i < -LIMIT_VALUE || i > LIMIT_VALUE) {
                throw new IllegalArgumentException("Array elements has to be included between -" + LIMIT_VALUE + " and +" + LIMIT_VALUE);
            }
        }
    }

    private void validateTarget(int target) {
        if (target < -LIMIT_VALUE || target > LIMIT_VALUE) {
            throw new IllegalArgumentException("Target is not in range");
        }
    }
}
