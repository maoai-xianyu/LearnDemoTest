package demo;

/**
 * Java 数据/0 的一些分析
 * 1. 任意整数（byte、short、int、long皆可）除以整数0结果为ArithmeticException；
 * 2. 0除以浮点0结果为NAN，细分的话包括以下三种情况：
 * **** 1. 0/0.0
 * **** 2. 0.0/0.0
 * **** 3. 0.0/0 虽然除的是个整数0，但在运算过程中发生了类型转化变成了浮点0
 * 3. 任意数除以浮点0结果为Infinity/-Infinity。
 * 4. java中浮点数0并非一个准确值，而是一个无限接近0的数
 * 5. Java float 和 double 类型，
 *    1. 就像其他任何语言（以及几乎任何硬件FP单元）一样，实现了浮点数学的IEEE 754标准，它要求除以零以返回特殊的“无穷大”值。抛出异常实际上会违反该标准。
 *    2. 整数算术（由Java和大多数其他语言和硬件实现为二进制补码表示）是不同的，没有特殊的无穷大或NaN值，因此抛出异常是一种有用的行为。
 *    3. Float 和 Double 的包装类中定义了： NaN  POSITIVE_INFINITY NEGATIVE_INFINITY
 */
public class TestFloatDouble {

    public static void main(String[] args) {
        float byteNum = ((byte) 1) / 0.0f;
        float byteNumZero = ((byte) 0) / 0.0f;
        System.out.println("byte 非0 / 0.0f = " + byteNum + " byte 0 / 0.0f = " + byteNumZero);

        float shortNum = ((short) 1) / 0.0f;
        float shortNumZero = ((short) 0) / 0.0f;
        System.out.println("short 非0 / 0.0f = " + shortNum + " short 0 / 0.0f = " + shortNumZero);

        float intNum = 1 / 0.0f;
        float intNumZero = 0 / 0.0f;
        System.out.println("int 非0 / 0.0f = " + intNum + " int 0 / 0.0f = " + intNumZero);

        float longNum = 1l / 0.0f;
        float longNumZero = 0l / 0.0f;
        System.out.println("long 非0 / 0.0f = " + longNum + " long 0 / 0.0f = " + longNumZero);

        float floatNum = 1f / 0.0f;
        float floatNumZero = 0f / 0.0f;
        System.out.println("float 非0 / 0.0f = " + floatNum + " float 0 / 0.0f = " + floatNumZero);

        float charNum = (char)1 / 0.0f;
        float charNumZero = (char)0f / 0.0f;
        System.out.println("char 非0 / 0.0f = " + charNum + " char 0 / 0.0f = " + charNumZero);

        double doubleNum = 1.0d / 0.0d;
        double doubleNumZero = 0.0d / 0.0d;
        System.out.println("double 非0 / 0.0f = " + doubleNum + " double 0 / 0.0f = " + doubleNumZero);

        float temp = (float) 139 / 190;
        float currentProgress = temp * 100;
        System.out.println(currentProgress);

        float tem = 222 / 0.0f;
        System.out.println("tem " + tem);
        float temp1 = 0.0f / 0.0f;
        System.out.println("tem1 " + temp1);
        System.out.println("Float.NaN " + Float.NaN);
        System.out.println("Float temp1 == NaN " + (temp1 == Float.NaN));
        System.out.println("Float temp1 is NaN " + Float.isNaN(temp1));
        System.out.println("Float intBitsToFloat " + Float.intBitsToFloat(0x7fc00000));

        float negativeInfinity = Float.NEGATIVE_INFINITY;
        float positiveInfinity = Float.POSITIVE_INFINITY;
        System.out.println("Float negativeInfinity " + negativeInfinity + " positiveInfinity " + positiveInfinity);

        System.out.println("------double的处理类似于float---------");
    }
}
