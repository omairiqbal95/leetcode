package Leetcode_1920;

public class BuildArrayPermutation {

    public int[] buildArray(int[] nums) {
        int[] res = new int [nums.length];
        
        for (int i = 0; i < nums.length; ++i) {
            res[i] = nums[nums[i]];
        }
        return res;
    }

    public static void main (String [] args) {

    }
}