package algorithm.my;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhangkun
 * @time 2020/6/10 11:39 下午
 * <p>
 * 测试List 一边查询一边删除  集合一遍添加一遍删除
 */
public class MainList {

    public static void main(String[] var0) {
        //testList();
        testListSelf();
    }

    private static void testListSelf() {
        List<String> var3 = new ArrayList<>();
        var3.add("aa");
        var3.add("bb");
        var3.add("cc");

        int size = var3.size();
        for (int i = 0; i < size; i++) {
            String var5 = var3.get(i);
            if ("bb".equals(var5)) {
                var3.remove(i);
                i--;
                size--;
                System.out.println("移除：i = " + i + " size " + size + " var3 list " + var3.size());
            } else {
                System.out.println("未移除：i = " + i + " size " + size + " var3 list " + var3.size());
            }

        }

        for (String test : var3) {
            System.out.println("test " + test);
        }
    }


    // 用 Iterator
    private static void testList() {
        List<String> var3 = new ArrayList<>();
        var3.add("aa");
        var3.add("bb");
        var3.add("cc");
        Iterator<String> var4 = var3.iterator();

        while (var4.hasNext()) {
            String var5 = var4.next();
            if ("aa".equals(var5)) {
                var4.remove();
            }
        }

        for (String test : var3) {
            System.out.println("test " + test);
        }
    }
}
