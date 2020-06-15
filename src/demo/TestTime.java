package demo;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by zhangkun
 * on 2017/11/5.
 */
public class TestTime {

    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        String format = dateFormat.format(date);
        System.out.println(" date " + date.getTime());
        System.out.println(" date " + System.currentTimeMillis());
        System.out.println(" date " + date.toString());
        System.out.println(" date " + format);



        DateTimeFormatter format1 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");

        DateTime dateTime = DateTime.parse("2012-12-21 23:22:45", format1);
        DateTime dt5 = new DateTime("2012-05-20T13:14:00");
        System.out.println("sdsd  " + dt5.toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println("sdsd  " + dateTime.toString());


        DateTime time = new DateTime(0);

        System.out.println("time  " + time.toString("yyyy-MM-dd HH:mm:ss"));

        //获取当前年中第一周中的星期几

        DateTime dateWeek = new DateTime();
        System.out.println(dateWeek.toDateTime().toString("yyyy-MM-dd HH:mm:ss:SSS"));


        System.out.println(dateWeek.dayOfWeek().getAsText());
        System.out.println(dateWeek.dayOfWeek().getAsText(Locale.ENGLISH));
        System.out.println(dateWeek.dayOfMonth().getAsText());
        System.out.println(dateWeek.dayOfMonth().getAsText(Locale.CHINESE));
        System.out.println(dateWeek.dayOfYear().getAsText());
        System.out.println(dateWeek.dayOfYear().getAsText(Locale.CHINESE));


        System.out.println(dateWeek.dayOfWeek().getAsShortText());
        System.out.println(dateWeek.dayOfWeek().getAsShortText(Locale.ENGLISH));
        System.out.println(dateWeek.dayOfMonth().getAsShortText(Locale.CHINESE));

        System.out.println(dateWeek.monthOfYear().getAsShortText());

    }
}
