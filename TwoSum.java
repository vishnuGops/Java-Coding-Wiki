// 1. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.
import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i])
                    return new int[] { nums[i], nums[j] };
            }
        }
        return new int[] {};
    }

    public static int[] twoSum2Map(int[] nums, int target) {
        Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            mapper.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mapper.containsKey(nums[i]) && mapper.get(diff) != i) {
                return new int[] { i, mapper.get(diff) };
            }
        }
        return new int[] {};

    }

    public static int[] twoSum1Map(int[] nums, int target) {
        Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mapper.containsKey(diff)) {
                return new int[] { i, mapper.get(diff) };
            }
            mapper.put(nums[i], i);
        }
        return new int[] {};

    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] nums1 = twoSum(nums, target);
        int[] nums2 = twoSum2Map(nums, target); // 2 pass hash map
        int[] nums3 = twoSum1Map(nums, target); // 1 pass hash map
        for (int i = 0; i < nums1.length; i++)
            System.out.println(nums3[i] + " ");
    }
}
