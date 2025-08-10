package max_area;

import java.util.List;

/**
 * LeetCode: https://leetcode.com/problems/container-with-most-water/description/
 */
public class MaxAreaOfWater {

    public Integer calculate(List<Integer> arr) {
        Integer maxArea = 0;
        for (int i = 0; i < arr.size() - 1; ++i) {
            for (int j = 1; j < arr.size(); ++j) {
                Integer base = (j - i) < 0 ? (j-i) * (-1) : (j-i);

                Integer height = arr.get(i) < arr.get(j) ? arr.get(i) : arr.get(j);
                Integer tempMax = base * height;

                if (tempMax > maxArea) {
                    maxArea = tempMax;
                }
            }
        }

        return maxArea;
    }
}
