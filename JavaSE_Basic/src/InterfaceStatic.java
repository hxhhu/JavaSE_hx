/**
 * Create Time: 2021/7/27 16:00
 */

/**
 * 纯抽象类，所以它不能定义实例字段
 *
 * 但是interface是可以有静态字段的，并且静态字段必须为final类型：
 *
 * 字段只能是public static final类型，所以我们可以把这三个修饰符都去掉。
 *
 * */

public interface InterfaceStatic {
    public static final int AGE = 22;
    String NAME = "郝宵";      // 编译器会自动加上public static final
}

class InterfaceStaticMain {
    public static void main(String[] args) {
        System.out.println(InterfaceStatic.NAME + InterfaceStatic.AGE);
    }
}