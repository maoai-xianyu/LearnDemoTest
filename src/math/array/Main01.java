package math.array;

/**
 * @author zhangkun
 * @time 2020/7/8 9:09 上午
 */
public class Main01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] scores = new int[]{100, 96, 66};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        for (int score : scores) {
            System.out.println(score);

        }
        System.out.println("----");
        print(5);


        System.out.println("**********");
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" - ");
        }


        System.out.println("*********");
        newArray();
    }

    public static void newArray() {
        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        array.add(1,100);
        System.out.println(array);
        array.addFirst(-1);
        System.out.println(array);
        // [-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        array.remove(2);
        System.out.println(array);


        System.out.println("数组扩容");
        Array<Integer> newArray = new Array<>();
        for (int i = 0; i < 10; i++) {
            newArray.addLast(i);
        }
        System.out.println(newArray);
        newArray.add(1,100);
        newArray.addFirst(-1);
        System.out.println(newArray);
        System.out.println("数组缩小");
        newArray.remove(2);
        System.out.println(newArray);
        newArray.removeElement(6);
        System.out.println(newArray);


    }


    public static void print(int n) {
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                System.out.print(" ");
            }
            for (int x = 0; x <= i; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
