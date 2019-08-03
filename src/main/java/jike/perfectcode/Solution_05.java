package jike.perfectcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-07-31 20:17
 * @Vertion 1.0
 **/
public class Solution_05 {

    /**
     * Given an array of integers, return indices of the two numbers
     * such that they add up to a specific target.
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {
                    map.get(complement), i
                };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public void getMap(){

    }


}
