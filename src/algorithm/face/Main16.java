package algorithm.face;

/**
 * @author zhangkun
 * @time 2020/7/3 5:39 下午
 * <p>
 * <p>
 * 比较两个版本号 version1 和 version2。
 * 如果 version1 > version2 返回 1，如果 version1 < version2 返回 -1， 除此之外返回 0。
 * <p>
 * 你可以假设版本字符串非空，并且只包含数字和 . 字符。. 字符不代表小数点，而是用于分隔数字序列。
 * 例如，2.5 不是“两个半”，也不是“差一半到三”，而是第二版中的第五个小版本。
 * 你可以假设版本号的每一级的默认修订版号为 0。例如，版本号 3.4 的第一级（大版本）和第二级（小版本）修订号分别为 3 和 4。其第三级和第四级修订号均为 0。
 * <p>
 * 示例 1:
 * 输入: version1 = "0.1", version2 = "1.1"
 * 输出: -1
 * <p>
 * 示例 2:
 * 输入: version1 = "1.0.1", version2 = "1"
 * 输出: 1
 * <p>
 * 示例 3:
 * 输入: version1 = "7.5.2.4", version2 = "7.5.3"
 * 输出: -1
 * <p>
 * 示例 4：
 * 输入：version1 = "1.01", version2 = "1.001"
 * 输出：0
 * 解释：忽略前导零，“01” 和 “001” 表示相同的数字 “1”。
 * <p>
 * 示例 5：
 * 输入：version1 = "1.0", version2 = "1.0.0"
 * 输出：0
 * 解释：version1 没有第三级修订号，这意味着它的第三级修订号默认为 “0”。
 */
public class Main16 {

    public static void main(String[] args) {

        String version1 = "1.1";
        String version2 = "1.0.0";

        System.out.println("result  " + compareVersion(version1, version2));


    }


    public static int compareVersion(String version1, String version2) {


        String[] verArray1 = version1.split("\\.");
        String[] verArray2 = version2.split("\\.");
        /*

        int var1 = verArray11.length;
        int var2 = verArray22.length;


        String[] verArray1 = null;
        String[] verArray2 = null;
        if (var1 > var2) {
            int temp = var1 - var2;
            verArray1 = verArray11;
            verArray2 = new String[var1];

            for (int i = 0; i < var2; i++) {
                verArray2[i] = verArray22[i];
            }

            for (int i = 0; i < temp; i++) {
                verArray2[var2 + i] = "0";
            }

        } else if (var1 < var2) {
            int temp = var2 - var1;
            verArray2 = verArray22;
            verArray1 = new String[var2];

            for (int i = 0; i < var1; i++) {
                verArray1[i] = verArray11[i];
            }
            for (int i = 0; i < temp; i++) {
                verArray1[var1 + i] = "0";
            }
        } else {
            verArray1 = verArray11;
            verArray2 = verArray22;
        }*/


        int index = 0;
        int diff = 0;
        int min = Math.min(verArray1.length, verArray2.length);

        while (index < min && (diff = verArray1[index].length() - verArray2[index].length()) == 0
                && (diff = Integer.parseInt(verArray1[index]) - Integer.parseInt(verArray2[index])) == 0) {
            ++index;
        }
        diff = (diff != 0) ? diff : verArray1.length - verArray2.length;

        return diff;
    }
}
