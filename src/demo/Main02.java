package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhangkun
 * @time 2020/8/6 1:21 下午
 *
 *  集合添加和删除
 */
public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello world");

        List<String> var3 = new ArrayList<>();
        var3.add("aa");
        var3.add("bb");
        var3.add("cc");
        Iterator<String> var4 = var3.iterator();
        System.out.println(var4.next());

        while (var4.hasNext()) {
            String var5 = (String) var4.next();
            if ("aa".equals(var5)) {
                var3.remove("aa");
            }
        }
    }

}
