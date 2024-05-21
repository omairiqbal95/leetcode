package Leetcode_1512;

public class GoodPairs {

    public static int numIdenticalPairsTwoPointers(int[] nums) {
        int goodPairs = 0;

        int l = 0;
        int r = l + 1;
        while (l < nums.length && r < nums.length) {
            if (nums[l] == nums[r]) {
                goodPairs++;
            }
            r++;
            if (r == nums.length) {
                l++;
                r = l + 1; 
            }
        }

        return goodPairs;
    }

    public static int numIdenticalPairsFoorLoop(int[] nums) {
        int goodPairs = 0;

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] == nums[j]) {
                    ++goodPairs;
                }
            }
        }
        return goodPairs;
    }

    public static void main (String[] args) {
        System.out.println(numIdenticalPairsFoorLoop(new int [] { 1,2,3,1,1,3}));
    }
}