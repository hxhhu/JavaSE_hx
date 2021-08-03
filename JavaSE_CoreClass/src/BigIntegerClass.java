package src;

import java.math.BigInteger;

/**
 * Create Time: 2021/8/2 9:00
 */

public class BigIntegerClass {
    public static void main(String[] args) {
        /**
         * BigInteger用于表示任意大小的整数；
         *
         * BigInteger和Integer、Long一样，也是不可变类，并且也继承自Number类。
         *
         * 将BigInteger转化成基本类型可以使用longValueExact()等方法保证结果准确；
         *
         * 与long型整数运算比，BigInteger不会有范围限制，但缺点是速度较慢；
         * */
        BigInteger bi = new BigInteger("1234567890");
        /**
         * 【BigInteger内部表示】
         * BigInteger内部用一个int[]数组来模拟一个非常大的整数
         * */
        System.out.println("bi的5次方= " + bi.pow(5));       // 五次方 2867971860299718107233761438093672048294900000
        System.out.println("---------------------");

        /**
         * 【BigInteger运算】
         * 对BigInteger做运算的时候，只能使用实例方法，例如：加法
         * */
        BigInteger bier = new BigInteger("1234567891234567890");
        System.out.println("bi+bier= " + bi.add(bier));    // 加和
        System.out.println("---------------------");

        /**
         * 【BigInteger转为long型】
         * */
        BigInteger test = new BigInteger("12345678900000");
        System.out.println(test.longValueExact());         // 12345678900000
        System.out.println(test.multiply(test).longValueExact());  // java.lang.ArithmeticException: BigInteger out of long range
        System.out.println("---------------------");

        /**
         * BigInteger和Integer、Long一样，也是不可变类，并且也继承自Number类。
         *
         * 因为Number定义了转换为基本类型的几个方法：
         *
         * 转换为byte：byteValue()
         * 转换为short：shortValue()
         * 转换为int：intValue()
         * 转换为long：longValue()
         * 转换为float：floatValue()
         * 转换为double：doubleValue()
         *
         * */
    }
}
