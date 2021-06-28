package com.sv.leetcode;

/**
 * https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
 * Given a 0-indexed integer array nums,
 * return true if it can be made strictly increasing after removing exactly one element, or false otherwise.
 * If the array is already strictly increasing, return true.
 */

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing1909 {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                //Optimization section:
                //Check if delete i - 1 element will solve the problem
                //or if delete i element will solve it
                //if any variants will not solve situation, than array cannot be sorted by one removing
                if ((i - 2 >= 0 && nums[i - 2] >= nums[i]) && (i + 1 < nums.length && nums[i - 1] >= nums[i + 1])) return false;
            }
        }

        if (count > 1) {
            return false;
        }

        return true;
    }
}
