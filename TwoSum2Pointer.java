// Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

// Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.

public class TwoSum2Pointer {
    public static int[] twoSum2P(int[] nums, int target) {
        int pointA = 0;
        int pointB = nums.length - 1;

        while (pointA < pointB) {
            if (nums[pointA] + nums[pointB] > target)
                pointB--;
            else if (nums[pointA] + nums[pointB] < target)
                pointA++;
            else
                return new int[] { pointA, pointB };
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4 };
        int target = 6;

        int[] nums1 = twoSum2P(nums, target);
        for (int i = 0; i < nums1.length; i++)
            System.out.println(nums1[i] + " ");
    }
}
