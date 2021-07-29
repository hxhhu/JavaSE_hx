import java.lang.*;
/**
 * Create Time: 2021/7/29 15:00
 */

/**
 * StringBuilder是可变对象，用来高效拼接字符串；
 *
 * StringBuilder可以支持链式操作，实现链式操作的关键是【返回实例本身】；
 *
 * StringBuffer是StringBuilder的线程安全版本，现在很少使用。
 * */
public class StringBuilder {
    public static void main(String[] args) {
        /**
         * Java编译器对String做了特殊处理，使得我们可以直接用+拼接字符串。
         *
         * 考察下面的循环代码：
         * String s = "";
         * for (int i = 0; i < 1000; i++) {
         *     s = s + "," + i;
         * }
         * 虽然可以直接拼接字符串，但是，在循环中，每次循环都会创建新的字符串对象，然后扔掉旧的字符串。这样，绝大部分字符串都是临时对象，不但浪费内存，还会影响GC效率。
         *
         * 为了能高效拼接字符串，Java标准库提供了StringBuilder
         * 它是一个可变对象，可以预分配缓冲区
         * 往StringBuilder中新增字符时，不会创建新的临时对象：
         *
         * */
        java.lang.StringBuilder sb = new java.lang.StringBuilder(1024);
        for (int i = 0;i < 100;i++) {
            sb.append(",");
            sb.append(i);
        }
        System.out.println(sb);

        /**
         * 链式操作
         * */
        Adder adder = new Adder();
        adder.add(3)
             .add(5)
             .add(6);
        System.out.println(adder.value());
    }
}

class Adder {
    private int sum;

    public Adder add(int n) {
        sum += n;
        return this;         // this代表Adder
    }

    public int value() {
        return sum;
    }
}
