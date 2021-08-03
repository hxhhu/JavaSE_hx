package src;

import java.math.BigDecimal;

/**
 * Create Time: 2021/8/2 15:00
 */
public class BigDecimalClass {
    public static void main(String[] args) {
        /**
         * BigDecimal用于表示精确的小数，常用于财务计算；
         *
         * 比较BigInteger的值是否相等，必须使用compareTo()而不能使用equals()
         * */
        BigDecimal b1 = new BigDecimal("123.456");
        BigDecimal b2 = new BigDecimal("1234560");
        System.out.println(b1.scale());    // 3   b1有三位小数位
        System.out.println(b2.scale());    // 0   b2有零位小数位
    }
}
