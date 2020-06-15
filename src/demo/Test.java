package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhangkun
 * on 2017/10/24.
 */
public class Test {

    private static SimpleDateFormat dateTimeformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat dateFormat = new SimpleDateFormat(
            "yyyy-MM-dd");

    public static void main(String[] args) {

        String regEx = "[a-zA-Z]+[-']?[a-zA-Z]*";
        String userName = "Oh, oh. Quick, quick.Make a wish. Make a wish.You gotta[^2] make a wish.";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(userName);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(" 测试 " + group);
        }

        System.out.println(isMobileNO("18977778989"));

        String str = "sdfsdfqslkjksddfdsfs0.1";

        System.out.println(" 是否有数字 " + hasDigit(str));

        String date = "2017-08-29";
        System.out.println("date " + formateToMonthAndDay(date));
        System.out.println("dateadas sadas " + formatDateToStr(new Date()));



        Info info = new Info();

        System.out.println("  什么  "+info.getName());
        testStringSwitch("");
    }

    public static boolean isMobileNO(String mobiles) {
        Pattern p = Pattern
                .compile("^((13[0-9])|(15[^4,//D])|(18[0,5-9]))//d{8}$");
        Matcher m = p.matcher(mobiles);
        System.out.println(m.matches() + "---");
        return m.matches();
    }

    public static boolean hasDigit(String content) {
        boolean flag = false;
        Pattern p = Pattern.compile(".*\\d+.*");
        Matcher m = p.matcher(content);
        if (m.matches()) {
            flag = true;
        }
        return flag;
    }


    public static String formateToMonthAndDay(String date) {
        if (date.length() > 5) {
            String[] temp = date.substring(5).split("-");
            String month;
            String day;
            if (temp[0].substring(0, 1).equals("0")) {
                month = temp[0].substring(1, 2) + "月";
            } else {
                month = temp[0] + "月";
            }
            if (temp[1].substring(0, 1).equals("0")) {
                day = temp[1].substring(1, 2) + "日";
            } else {
                day = temp[1] + "日";
            }
            return month + day;
        } else {
            return date;
        }
    }

    public static String formatToStr(String paramDate) {
        return dateTimeformat.format(paramDate);
    }

    public static String formatDateToStr(Date paramDate) {
        return dateFormat.format(paramDate);
    }

    private static void testStringSwitch(String str) {
        switch (str) {
            case "TEST1":
                System.out.println("TEST1");
                break;

            case "TEST2":
                System.out.println("TEST1");
                break;

            case "TEST3":
                System.out.println("TEST1");
                break;

            case "TEST4":
                System.out.println("TEST1");
                break;

            default:
                System.out.println("空");
                break;

        }
    }
}
