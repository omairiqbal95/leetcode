package Leetcode_1929;

import java.util.Arrays;

public class ConcatenationOfArray {
    
    public static int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] res = new int[size * 2];

        for (int i = 0; i < size; ++i) {
            res[i] = nums[i];
            res[i + size] = nums[i];
        }
        
        return res;
    }

    public static void main (String[] args) {
        int[] res = getConcatenation(new int[] {1, 2, 3});
        Arrays.asList(res).stream().forEach(n -> System.out.println(n));
    }
}