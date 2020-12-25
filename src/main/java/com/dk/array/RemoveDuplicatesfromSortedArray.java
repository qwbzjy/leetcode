package com.dk.array;

/**
 * 给定一个已排序的数组nums，就地删除重复项，以使每个元素仅出现一次并返回新的长度。
 * <p>
 * 不要为另一个数组分配额外的空间，必须通过使用O（1）额外的内存就地修改输入数组来做到这一点。
 */
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 3, 4};
        int resLength = removeDuplicates(nums);
        System.out.println("新长度: " + resLength);
        for (int k = 0; k < resLength; k++) {
            System.out.println(nums[k]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
