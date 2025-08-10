package max_area;

import java.util.Arrays;
import java.util.List;

/**
 * LeetCode: https://leetcode.com/problems/container-with-most-water/description/
 */
public class Main {
    public static void main(String[] s) {
        MaxAreaOfWater maxAreaOfWater = new MaxAreaOfWater();
        List<Integer> list = Arrays.asList(10,2,3,4,11,5,10);
        System.out.println("Max water cointained is :" + maxAreaOfWater.calculate(list));

    }
}
