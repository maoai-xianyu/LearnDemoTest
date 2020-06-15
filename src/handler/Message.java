package handler;

/**
 * @author zhangkun
 * @time 2020/3/14 9:12 上午
 */
public class Message {
    public Object obj;
    public Handler target;
    public long when;
    public Message next;

    @Override
    public String toString() {
        return "Message{" +
                "obj=" + obj +
                ", target=" + target +
                ", when=" + when +
                ", next=" + next +
                '}';
    }
}
