public class ObjectBasic_0715 {
    public static void main(String[] args) {
        Person hao = new Person();
    }
}

// 一个class可以包含多个field，例如，我们给Person类就定义了两个field：
class Person {

    private String name;    // 直接操作field，易造成逻辑混乱。

    private int age;        // 为了避免外部代码直接访问field，可用private修饰field，拒绝外部访问：

    private String[] names;


    /*   定义方法的语法
            修饰符 方法返回类型 方法名(方法参数列表) {
                         若干方法语句;
                         return 方法返回值;
            }
         方法返回值通过return语句实现，如果没有返回值，返回类型设置为void，可以省略return。
    */
    /* 外部代码可以调用方法setName()和setAge()来 间接 修改private字段 */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 在方法检查参数
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("invalid name value");
        }
        this.name = name;                   //在方法内部，可以使用隐含变量this，它始终指向当前实例。因此，通过this.field就可以访问当前实例的字段。

    }

    public void setNames(String ... names) {   //  可变参数用类型...定义，可变参数相当于数组类型：
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 150) {
            throw new IllegalArgumentException("invalid age value"); // 若setAge()检查传入的参数超出范围，直接报错。
        }
        this.age = calcAge(2021);
    }

    private int calcAge(int currentYear) {  //calcAge()是一个private方法，外部代码无法调用，但是，内部方法getAge()可以调用它。
        return currentYear - this.age;
    }
}
