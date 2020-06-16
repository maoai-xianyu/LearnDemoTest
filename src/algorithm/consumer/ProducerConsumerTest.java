package algorithm.consumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 生产者消费者模型 https://www.sohu.com/a/236536167_684445
 */
public class ProducerConsumerTest {

    public static void main(String[] args) {
        final Queue<Integer> sharedQueue = new LinkedList();
        Thread producer = new Producer(sharedQueue);
        Thread consumer = new Consumer(sharedQueue);
        producer.start();
        consumer.start();
    }

}