package com.dk.array;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        for (int var : ints) {
            System.out.println(var);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                indexes[0] = i;
                indexes[1] = hashMap.get(nums[i]);
                return indexes;
            }
            hashMap.put(target - nums[i], i);
        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = nums.length - 1; j > i; j--) {
//                if (nums[i] + nums[j] == target) {
//                    indexes[0] = i;
//                    indexes[1] = j;
//                    return indexes;
//                }
//            }
//        }
        return indexes;
    }


}
