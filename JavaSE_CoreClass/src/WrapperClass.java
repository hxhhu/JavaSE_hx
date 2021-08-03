package src;

/**
 * Create Time: 2021/7/30 9:00
 */
public class WrapperClass {
    public static void main(String[] args) {
        /**
         *  Java的数据类型分两种
         *      【基本类型】byte,short,int,long,boolean,float,double,char （不可以为null）
         *      【引用类型】所有class和interface类型 （可以为null）
         * */
        String s = null;
        // int n = null;    compile error!

        /**
         * Java核心库提供的包装类型可以把基本类型包装为class；
         *
         * 【包装类型的比较】必须使用equals()；
         *
         * 整数和浮点数的包装类型都继承自Number；
         *
         * 包装类型提供了大量实用方法。
         *
         * 所有包装类都是不变类。
         * */
        /**
         * 比如，想要把int基本类型变成一个引用类型，我们可以定义一个Integer类，
         *
         * 它只包含一个实例字段int，
         *
         * 这样，Integer类就可以视为int的包装类（Wrapper Class）：
         * */
        Integer n1 = null;
        System.out.println(n1);    // null
        IntegerMe n2 = new IntegerMe(99);
        System.out.println(n2);    // Integer@1b6d3586
        int n3 = n2.getValue();
        System.out.println(n3);    // 99
        System.out.println("---------------------");

        /**
         * 实际上，因为包装类型非常有用，Java核心库为每种基本类型都提供了对应的包装类型：
         *
         * 基本类型	对应的引用类型
         * boolean	java.lang.Boolean
         * byte	    java.lang.Byte
         * short	java.lang.Short
         * int	    java.lang.Integer
         * long	    java.lang.Long
         * float	java.lang.Float
         * double	java.lang.Double
         * char	    java.lang.Character
         *
         * 我们可以直接使用，并不需要自己去定义：
         * */
        Integer integer1 = new Integer(6);           // 【不推荐】通过new操作符创建Integer实例(会有编译警告);
        Integer integer2 = Integer.valueOf(9);       // 【推荐】通过静态方法valueOf(int)创建Integer实例;
        Integer integer3 = Integer.valueOf("101");   //        通过静态方法valueOf(String)创建Integer实例;
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
        System.out.println("------------------");

        /**
         * 【不变类】所有的包装类型都是不变类，源码如下：
         * public final class Integer{
         *      private final int value;
         * }
         * 因此，一旦创建了Integer对象，该对象就是不变的
         *
         * 对两个Integer实例进行比较要特别注意，绝对不能用==。要用equals()比较。
         *【原因】引用类型比较不能用==
         *
         * */
        Integer x = 2;
        Integer y = 3;
        Integer z = 3;
        System.out.println("x.equals(y):  " + x.equals(y));  // false
        System.out.println("y.equals(z):  " + y.equals(z));  // true
        System.out.println("------------------------");

        /**
         * 【进制转换】
         *
         * Integer本身还提供了大量方法，例如，最常用的静态方法parseInt()可以把字符串解析成一个整数
         *
         * */
        System.out.println(Integer.parseInt("100"));             // 100
        System.out.println(Integer.parseInt("100",16));    // 256  因为按16进制解析


    }
}

class IntegerMe {
    private int value;

    IntegerMe(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
