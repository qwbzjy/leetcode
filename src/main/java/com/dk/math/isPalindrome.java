package com.dk.math;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 */
public class isPalindrome {

    public static void main(String[] args) {
        int a = 121, b = -121, c = 10;
        System.out.println(isPalindrome(a));

        System.out.println(isPalindrome(b));

        System.out.println(isPalindrome(c));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rem = 0, y = 0;
        int quo = x;
        while (quo != 0) {
            rem = quo % 10;
            y = y * 10 + rem;
            quo = quo / 10;
        }
        return y == x;
    }
}
