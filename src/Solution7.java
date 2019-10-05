/**
 * New
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @author wyc
 * @date 2019/8/24
 */
public class Solution7 {

    /**
     * main方法
     *
     * @param args String[] 参数数组
     */
    public static void main(String[] args) {
        int num = 120;
        Solution7 solution7 = new Solution7();
        int result = solution7.reverse(num);
        System.out.println("反转之前的数字为：" + num);
        System.out.println("反转之后的数字为：" + result);
    }

    /**
     * 整数反转
     * 思路：除余法
     *
     * @param x int 要反转的整数
     * @return int 反转之后的整数
     */
    private int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
