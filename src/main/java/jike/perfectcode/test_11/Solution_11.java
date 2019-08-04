package jike.perfectcode.test_11;

/*
Copyright (c) 2019 leetcode 算法练习
给定整形数组和目标值，求数组中那两个元素之和等于目标值
example : 输入 [2,4,6,7,] target = 10 ;return [4,6]
*/

import java.util.HashMap;
import java.util.Map;

class Solution_11 {

    //为了展示属性应该放的位置，强加属性，关键字顺序也是老师推荐的
    private static final long serialVersionUID = 5454155825314635342L;

    //只有一个构造方法可以省略，多个构造方法时，空实现换行加注解
    public Solution_11(){
        //blank 空实现
    }

    /**
     * Given an array of integers, return indices of the two numbers
     * such that they add up to a specific target.
     * return int[0] if nums==null or nums.length==0 or result not found.
     */
    public int[] twoSum(int[] nums, int target) {

        //check 代码块之间空行隔开
        if (nums==null || nums.length==0) {
            return new int[0];//老师提示返回int[0]避免空指针
        }

        //algorithm begin
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

        //not found
        return new int[0];
    }

    public static void main(String[] args) {
        Solution_11 solution_11 = new Solution_11();
        int[] ints = solution_11.twoSum(new int[]{2, 4, 6, 7}, 10);
        System.out.println(ints);

        long sum = 0L;

        Long a = 0L;
    }
}
