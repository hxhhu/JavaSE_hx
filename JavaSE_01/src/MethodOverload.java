/**
 * Create Time: 2021/7/19 10:00
 */
public class MethodOverload {
}

/**
 * 【定义】：方法重载是指多个方法的方法名相同，但各自的参数不同；
 *
 * 【特点】：重载方法应该完成类似的功能，参考String的indexOf()；
 *
 * 【要求】：重载方法返回值类型应该相同。
 *
 */
class Hello{

    public Hello() {
        System.out.println("Hello,world!");
    }
    public Hello(String name) {
        System.out.println("Hello,"+name);
    }
}

