import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 *
 * @author wyc
 * @date 2019/8/24
 */
public class Solution14 {

    /**
     * main方法
     *
     * @param args String[] 参数数组
     */
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Solution14 solution14 = new Solution14();
        String result = solution14.longestCommonPrefix(strs);
        System.out.println("字符串数组：" + Arrays.toString(strs) + " 的最长公共前缀为：" + result);
    }

    /**
     * 最长公共前缀
     * 思路：循环数组，startsWith() 方法用于检测字符串是否以指定的前缀开始。
     *
     * @param strs Sting[] 字符串数组
     * @return String 最长的公共前缀
     */
    public String longestCommonPrefix(String[] strs) {
        int count = strs.length;
        String prefix = "";
        if (count != 0) {
            prefix = strs[0];
        }
        for (String str : strs) {
            //关键代码，不断的从后往前截取字符串，然后与之相比，直到startsWith()返回true
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
