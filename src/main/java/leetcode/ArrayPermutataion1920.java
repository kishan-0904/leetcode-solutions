package leetcode;


/**
 * @author kishanjaiswal
 * 
 * Leetcode problem - 1920
 * Given a zero-based permutation nums (0-indexed),
 * Build an array ans of the same length where
 * ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 */

public class ArrayPermutataion1920 {
	public static void main(String[] args) {
		int[] nums1 = {0,2,1,5,3,4};
		int[] nums2 = {5,0,1,2,3,4};
		
		System.out.println("Response1: " + buildArray(nums1)[0]);
		System.out.println("Response1: " + buildArray(nums2)[0]);
	}

	private static int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int j = nums[i];
			ans[i] = nums[j];
		}
		
		return ans;
	}
}
