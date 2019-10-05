/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 * @author wyc
 * @date 2019/8/24
 */
public class Solution9 {
    /**
     * main方法
     *
     * @param args String[] 参数数组
     */
    public static void main(String[] args) {
        int num = 1212;
        Solution9 solution9 = new Solution9();
        boolean result = solution9.isPalindrome(num);
        if (result) {
            System.out.println("整数：" + num + "是回文数");
        } else {
            System.out.println("整数：" + num + "不是回文数");
        }

    }

    /**
     * 回文数
     *
     * @param x int 要验证的数字
     * @return boolean 验证结果
     */
    private boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder str = sb.append(x);
        StringBuilder str1 = sb.reverse();
        return str.equals(str1);
    }

    /**
     * 回文数
     * 思路：组成反转后的字符串比较
     *
     * @param x int 要验证的数字
     * @return boolean 验证结果
     */
    private boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        boolean flag;
        StringBuilder buf = new StringBuilder();
        String s = String.valueOf(x);
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            buf.append(ch[i]);
        }
        String s1 = buf.toString();
        flag = s1.equals(s);
        return flag;
    }
}
