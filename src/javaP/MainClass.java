package javaP;

class OutterClass {
    private int i = 1;

    class InnerClass {
        // 非静态内部类不能添加静态属性
        //private static String name = "innerCLass";
        public void displayPrivate() {
            System.out.println(i);
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        OutterClass outter = new OutterClass();
        OutterClass.InnerClass inner = outter.new InnerClass();
        inner.displayPrivate();
    }
}