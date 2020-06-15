package demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author zhangkun
 * @time 2020/4/8 2:52 下午
 */
public class TestMap {

    public static void main(String[] args) {


        Map<String,String> stringStringMap = new HashMap<>();


        stringStringMap.put("Qaaaaa","sssssss");
        stringStringMap.put("Qaaaaa","sssssssaaaa4");

        System.out.println(stringStringMap.get("Qaaaaa"));



        boolean test = true;

        boolean test1 = false;


        System.out.println("sss  "+(test && !test1));


        System.out.println("22222 "+ ((4< 3) && false));


        LinkedList<String> strings = new LinkedList<>();

        strings.add("tes1");
        strings.add("tes2");
        strings.add("tes1");
        strings.add("tes4");
        strings.add("tes5");

        String first = strings.getFirst();
        System.out.println(first);
        strings.removeFirst();

        strings.add("tes6");
        strings.add("tes7");
        System.out.println("------------");
        String first1 = strings.getFirst();
        System.out.println(first1);
        strings.removeFirst();
        System.out.println("------------");
        String first2 = strings.getFirst();
        System.out.println(first2);
        
    }
}
