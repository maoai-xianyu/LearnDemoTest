package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangkun
 * on 2018/3/31.
 */
public class TestList {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 23; i++) {
            strings.add("test"+i);
        }
        strings.remove(2);

        System.out.println("size "+ strings.size());

        strings.remove(2);

        System.out.println("size "+ strings.size());

        for (String ss: strings) {
            System.out.println("结果 "+ ss);
        }
        System.out.println("------------------ ");

        List<String> stringsList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            stringsList.add("stringsList"+i);
        }

        stringsList.remove("stringsList1");

        for (int i = 0; i < stringsList.size(); i++) {
            System.out.println("stringsList "+ stringsList.get(i));
        }

        stringsList.add(1,"stringsList1");


        System.out.println("------------------ ");
        for (int i = 0; i < stringsList.size(); i++) {
            System.out.println("add stringsList "+ stringsList.get(i));
        }



        List<String> listTest = new ArrayList<>();


        List<String> listTestAdd = null;

        listTest.addAll(listTestAdd);

        System.out.println(listTest.size());
    }
}
