/**
 * Create Time: 2021/7/27 16:00
 */
package hello;

/**
 * 位于同一个包的类，可以访问包作用域的字段和方法。
 *
 * 不用public、protected、private修饰的字段和方法就是包作用域。
 *
 * */
public class Package {
    //包作用域
    void hello(){
        System.out.println("hello,package!");
    }
}
