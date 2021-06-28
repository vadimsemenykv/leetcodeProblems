package com.sv.leetcode;

/**
 * https://leetcode.com/problems/roman-to-integer/
 * Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger13 {
    protected final static int[] charMap;

    static {
        charMap = new int[26];
        charMap['I' - 'A'] = 1;
        charMap['V' - 'A'] = 5;
        charMap['X' - 'A'] = 10;
        charMap['L' - 'A'] = 50;
        charMap['C' - 'A'] = 100;
        charMap['D' - 'A'] = 500;
        charMap['M' - 'A'] = 1000;
    }

    public int romanToInt(String s) {
        int res = 0;
        int prev = 1000;
        for (char cc : s.toCharArray()) {
            int current = parse(cc);
            if (current > prev) res -= 2 * prev;
            res += current;
            prev = current;
        }
        return res;
    }

    protected int parse(char ch) {
        return charMap[ch - 'A'];
    }
}
