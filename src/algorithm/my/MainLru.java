package algorithm.my;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhangkun
 * @time 2020/6/16 4:28 下午
 * <p>
 * Lru 算法  最近最少使用原则
 */
public class MainLru<K, V> extends LinkedHashMap<K, V> {

    private int maxSize;

    public MainLru(int maxSize) {
        super(16, 0.75f, true);
        this.maxSize = maxSize;
    }

    // 删除老的数据
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }
}

class Test1 {
    public static void main(String[] args) {
        MainLru<String, String> stringStringMainLru = new MainLru<>(3);

        for (int i = 0; i < 10; i++) {
            stringStringMainLru.put("i" + i, i + "-" + i);
        }

        for (Map.Entry<String,String> entry : stringStringMainLru.entrySet()){
            System.out.println(entry.getKey()+" === "+entry.getValue());
        }

    }
}
