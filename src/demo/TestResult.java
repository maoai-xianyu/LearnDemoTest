package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * create by zhangkun .
 * on 2018/11/20
 */
public class TestResult {
    public static void main(String[] args) {

        System.out.println("A_PLUS "+(RecordResult.A_PLUS.ordinal() > RecordResult.A.ordinal()));
        System.out.println("A_PLUS "+RecordResult.A_PLUS.ordinal() );
        System.out.println("A "+RecordResult.A.ordinal());


        List<RecordResult> recordResultList = new ArrayList<>();

        recordResultList.sort((o1,o2)->{
         return Integer.compare(o1.ordinal(),o2.ordinal());
        });




        RecordResult.A_PLUS.ordinal();



        HashMap<String,String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("Testq","s");
        stringStringHashMap.put("Testq","sssss");
        System.out.println("  stringStringHashMap "+stringStringHashMap.toString());
    }
}
