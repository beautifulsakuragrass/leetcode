import java.util.Arrays;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author wyc
 * @date 2019/8/24
 */
public class Solution1 {

    /**
     * main方法
     *
     * @param args String[] 参数数组
     */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution1 solution1 = new Solution1();
        int[] result = solution1.twoSum(nums, target);
        System.out.println("两数之和在数组中的下标为：" + Arrays.toString(result));
    }

    /**
     * 两数之和
     * 思路：两次循环
     *
     * @param nums   int[] 要寻址的数组
     * @param target int 目标数字
     * @return int[] 返回两个数字的下标
     */
    private int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    System.out.println(i + " " + j);
                    System.out.println(nums[i] + " " + nums[j]);
                    return new int[]{i, j};
                }
            }

        }

        throw new IllegalArgumentException("No two sum solution");
    }
}