/**
 * Create Time: 2021/7/15 10:00
 */
public class MethodBasic {
    public static void main(String[] args) {
        PersonMethod hao = new PersonMethod();
    }
}

    /**
    * 【定义】：一个class可以包含多个field，例如，我们给Person类就定义了几个field：
    * */
 class PersonMethod {
    /**
     * 【问题】：直接操作field，易造成逻辑混乱。
     * 【解决办法】：为了避免外部代码直接访问field，可用private修饰，拒绝外部访问
     *              因此我们需要使用方法（method）来让外部代码可以间接修改field
     * 【用法】：调用方法的语法是实例变量.方法名(参数);      例如：ming.setName("Xiao Ming");
     * */
    private String name;

    private int age;

    private String[] names;

    /**
     *       【定义方法的语法】
     *       修饰符 方法返回类型 方法名(方法参数列表) {
     *                   若干方法语句;
     *                    return 方法返回值;
     *       }
     *       【返回值】：方法返回值通过return语句实现，如果没有返回值，返回类型设置为void，可以省略return。
     * */

    public String getName() {
        return name;
    }

    /**
     * 【作用域】：public方法允许外部调用
     * */
    public void setName(String name) {
        // 检查参数
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("invalid name value");
        }
        //在方法内部，可使用隐含变量this，它始终指向当前实例
        this.name = name;
    }

    public void setNames(String ... names) {   //  可变参数用类型...定义。调用时就可以写x.setNames();或者x.setNames("hx");或者x.setNames("hx","brq");
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 150) {
            //  若传入的参数超出范围，直接报错：
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}
