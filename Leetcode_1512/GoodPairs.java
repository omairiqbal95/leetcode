package Leetcode_1512;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

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

    public static int numIdenticalPairsForLoop(int[] nums) {
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

    public static int numIdenticalPairsMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int goodPairs = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                goodPairs += map.get(nums[i]); 
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        return goodPairs;
    }

    public static void main (String[] args) {
        System.out.println(numIdenticalPairsMap(new int [] { 1,2,3,1,1,3}));
    }
}