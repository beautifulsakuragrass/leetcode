/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * 在真实的面试中遇到过这道题？
 *
 * @author wyc
 * @date 2019/8/24
 */
public class Solution20 {

    /**
     * main方法
     *
     * @param args String[] 参数数组
     */
    public static void main(String[] args) {

    }

    /**
     * 有效的括号
     * 思路：字符串反转，然后进行比较，是否一样。（此方法只适合只包含括号的字符串）
     *
     * @param s String 要判断的字符串
     * @return boolean 是否有效
     */
    public boolean isValid(String s) {
        return true;
    }

}
