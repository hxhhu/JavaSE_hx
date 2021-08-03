package src;

/**
 * Create Time: 2021/7/30 10:00
 */
public class AutoBoxing {
    public static void main(String[] args) {
        /**
         *  因为int和Integer可以互相转化
         *
         *  所以Java编译器可以帮助我们自动在int和Integer之间转型
         *
         *  这种直接把int变为Integer的方法，  称为自动装箱（Auto Boxing）
         *
         *  反之，把Integer变为int的赋值写法，称为自动拆箱（Auto Unboxing）
         * */
        int i = 100;
        Integer b = Integer.valueOf(i);    // Auto Boxing
        Integer u = 100;
        int ub = u;                        // Auto Unboxing
    }
}
