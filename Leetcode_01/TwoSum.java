package Leetcode_01;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (res.containsKey(target - nums[i])) {
                return new int [] {i, res.get(target - nums[i])};
            }
            res.put(nums[i], i);
        }

        return new int [] {};
    }

    public static void main(String[] args) {
        int [] a = new int[] { 1, 2 };
        System.out.println(a[0]);
        
        
    }
}