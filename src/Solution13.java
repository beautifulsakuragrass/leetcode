import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "III"
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: "IV"
 * 输出: 4
 * 示例 3:
 * <p>
 * 输入: "IX"
 * 输出: 9
 * 示例 4:
 * <p>
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * 示例 5:
 * <p>
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 * @author wyc
 * @date 2019/8/24
 */
public class Solution13 {

    /**
     * I             1
     */
    private static final String I = "I";

    /**
     * V             5
     */
    private static final String V = "V";

    /**
     * X             10
     */
    private static final String X = "X";

    /**
     * L             50
     */
    private static final String L = "L";

    /**
     * C             100
     */
    private static final String C = "C";

    /**
     * D             500
     */
    private static final String D = "D";

    /**
     * M             1000
     */
    private static final String M = "M";

    /**
     * IV             4
     */
    private static final String IV = "IV";

    /**
     * IX             9
     */
    private static final String IX = "IX";

    /**
     * XL             40
     */
    private static final String XL = "XL";

    /**
     * XC             90
     */
    private static final String XC = "XC";

    /**
     * CD             400
     */
    private static final String CD = "CD";

    /**
     * CM             900
     */
    private static final String CM = "CM";

    /**
     * main方法
     *
     * @param args String[] 参数数组
     */
    public static void main(String[] args) {
        String str = "MCMXCIV";
        Solution13 solution13 = new Solution13();
        int result = solution13.romanToInt(str);
        System.out.println("罗马数字：" + str + " 对应的整数为" + result);
    }

    /**
     * 罗马数字转整数
     * 思路：逆序遍历给定的字符串的每一个字符，根据题中的字符表将字符映射为数字，如果小的数在大的数前面就需要拿大的数减去小的数，否则相加。
     *
     * @param s String 罗马数字
     * @return int 整数
     */
    private int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>(16);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = map.get(s.charAt(s.length() - 1));
        System.out.println(result);
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
            } else {
                result -= map.get(s.charAt(i));
            }
        }
        return result;
    }
}
