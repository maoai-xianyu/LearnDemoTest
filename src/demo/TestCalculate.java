package demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangkun
 * on 2018/2/6.
 */
public class TestCalculate {

    public static void main(String[] args) {
        System.out.println("第一"+volume(1));
        System.out.println("第二"+volume(9));
        System.out.println("第三"+volume(11));
        System.out.println("第四"+volume(19));
        System.out.println("第五"+volume(21));
        System.out.println("第六"+volume(29));
        System.out.println("第七"+volume(31));
        System.out.println("第八"+volume(39));
        System.out.println("第九"+volume(41));
        System.out.println("第十"+volume(49));
        System.out.println("第十一"+volume(51));
        System.out.println("第十二"+volume(59));

        System.out.println("double  =  "+(double)(1+1)/3);

        Info info = new Info();
        System.out.println("int "+info.getName());

        Map<String,Integer> integerMap = new HashMap<>();
        integerMap.put("A",1);
        integerMap.put("N",1);
        integerMap.put("C",1);

        System.out.println(" E "+integerMap.get("E"));
    }

    private static double volume(int volume) {

        return 50 * (Math.sin(-0.00042 * volume * volume + 0.0733 * volume - 1.57) + 1);
    }
}
