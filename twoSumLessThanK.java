import java.util.Arrays;

// Given an array nums of integers and integer k, return the maximum sum such that there exists i < j with nums[i] + nums[j] = sum and sum < k. If no i, j exist satisfying this equation, return -1.

//using brute force
public class twoSumLessThanK {
    public static int twoSum(int[] nums, int k) {
        int max_sum = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] < k) {
                    int sum = nums[i] + nums[j];
                    max_sum = Math.max(sum, max_sum);
                }
            }
        }
        return max_sum;
    }

    // using 2 pointers
    public static int twoSum2P(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        Arrays.sort(nums);
        while (left < right) {
            if (nums[left] + nums[right] < k) {
                int sum = nums[left] + nums[right];
                ans = Math.max(ans, sum);
                left++;
            } else
                right--;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 34, 23, 1, 24, 75, 33, 54, 8 };
        int target = 60;

        // int nums1 = twoSum(nums, target);
        int nums2 = twoSum2P(nums, target);
        // int nums3 = twoSumBS(nums, target);
        System.out.println(nums2);
    }
}
