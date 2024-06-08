package Leetcode_1470;

import java.util.Arrays;

public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] result = new ShuffleArray().shuffle(new int[] {1, 1, 2, 2}, 2);
        Arrays.stream(result).forEach(x -> System.out.println(x));
    }
}
