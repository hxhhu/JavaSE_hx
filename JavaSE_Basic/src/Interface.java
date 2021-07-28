/**
 * Create Time: 2021/7/26 10:00
 */
/**
 * Java接口(interface)定义了纯抽象规范，一个类可以实现多个接口；
 *
 * 接口也是数据类型，适用于向上转型和向下转型
 *
 * 接口的所有方法都是抽象方法
 *
 * 接口不能定义实例字段
 * */
public class Interface {
    public static void main(String[] args) {
        DefaultInterface p = new StudentDefaultInterface();
        p.setName("郝宵");
        p.run();
    }
}

/**
 * 如果一个抽象类没有字段，所有方法全部都是抽象方法，就可以把该抽象类改写为一个接口：interface
 *
 * 所谓interface，就是比抽象类还要抽象的纯抽象接口，它连字段都不能有。
 *
 * 因为接口定义的所有方法默认是public abstract的，所以这两个修饰符（写不写效果都一样）。
 * */
interface PersonInterface {
    void run();

    String getName();
}

interface ChineseInterface {
    void hello();
}

/**
 * 当一个具体的class去实现一个interface时，需使用implements关键字。
 *
 * 一个类只能继承一个类，但是一个类可以实现多个接口。
 * */
//类继承接口
class StudentImplements implements PersonInterface,ChineseInterface {

    private String name;

    StudentImplements(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("StudentImplements.run");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void hello() {
        System.out.println("StudentImplements.hello");
    }
}

/**
 * 接口继承
 * */
interface HelloInterface {
    void hello();
}

interface HelloInterfaceSon extends HelloInterface {
    void run();

    String getName();
}


/**
 * 【default】
 *
 * 1. 接口提供一个默认实现的方法，并且不强制实现类重写此方法
 *
 * 2. 默认方法使用default关键字来修饰
 * */
interface DefaultInterface {
    void setName(String name);

    String getName();

    default void run() {
        System.out.println(getName() + " run");
    }
}

class StudentDefaultInterface implements DefaultInterface {
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}