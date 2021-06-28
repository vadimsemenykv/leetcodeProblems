package com.sv.leetcode;

/**
 * https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
 * The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
 * Return the maximum such product difference.
 */

public class MaximumProductDifferenceBetweenTwoPairs1913 {
    public int maxProductDifference(int[] nums) {
        int bigA = 0, bigB = 0, smallA = Integer.MAX_VALUE, smallB = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > bigA) {
                bigB = bigA;
                bigA = n;
            } else if (n > bigB) {
                bigB = n;
            }

            if (n < smallA) {
                smallB = smallA;
                smallA = n;
            } else if (n < smallB) {
                smallB = n;
            }
        }

        return bigA * bigB - smallA * smallB;
    }
}
