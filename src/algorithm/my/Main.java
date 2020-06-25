package algorithm.my;

import java.util.*;

/**
 * @author zhangkun
 * @time 2020/6/16 8:49 上午
 * <p>
 * 泛型擦出  和 LinkedHashMap
 */
public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        List<String> listString = new ArrayList<String>();
        List<Integer> listInteger = new ArrayList<Integer>();

        try {
            list.getClass().getMethod("add", Object.class).invoke(list, 1);
            listString.getClass().getMethod("add", Object.class).invoke(listString, 1);
            // 给不服气的读者们的测试之处，你可以改成字符串来尝试。
            listInteger.getClass().getMethod("add", Object.class).invoke(listInteger, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("list size:" + list.size());
        System.out.println("listString size:" + listString.size());
        System.out.println("listInteger size:" + listInteger.size());


        List<Object> objects = new ArrayList<>();

        objects.add("tsest");


        Map<String, String> map = new LinkedHashMap<>();
        map.put("a1", "aa");
        map.put("a2", "bb");
        map.put("a3", "cc");
        map.put("a4", "dd");
        map.put(null, null);

        for (Map.Entry<String,String> entry :map.entrySet()) {
            System.out.println(entry.getKey()+"  === "+entry.getValue());
        }

        for (Iterator iterator = map.values().iterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"== "+next.getValue());
        }
        System.out.println("---------");
        Map<String, String> map1 = new LinkedHashMap<>(16,0.75f,true);
        map1.put("a1", "aa");
        map1.put("a2", "bb");
        map1.put("a3", "cc");
        map1.put("a4", "dd");
        map1.put("a5", "dd1");
        map1.put("a6", "dd2");
        for (Map.Entry<String,String> entry :map1.entrySet()) {
            System.out.println(entry.getKey()+"  === "+entry.getValue());
        }
        String a1 = map1.get("a3");
        String a5 = map1.get("a5");
        System.out.println(a1);
        for (Map.Entry<String,String> entry :map1.entrySet()) {
            System.out.println(entry.getKey()+"  === "+entry.getValue());
        }

    }


}
