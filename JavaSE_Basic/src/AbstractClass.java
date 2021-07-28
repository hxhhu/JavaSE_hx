/**
 * Create Time: 2021/7/27 10:00
 */

public class AbstractClass {
    /**
     * 如果父类的方法本身不需实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法：
     *
     * 定义了抽象方法的class【必须】被定义为抽象类！
     * */

    /**
     * 面向抽象编程使得调用者只关心抽象方法的定义，不关心子类的具体实现。
     * */
    PersonAbstract p1 = new StudentAbstract();
    PersonAbstract p2 = new TeacherAbstract();
}

/**
 * 通过abstract定义的方法是抽象方法，它只有定义，没有实现任何方法语句。
 *
 *    抽象类本身被设计成只能被继承！无法实例化！
 *    PersonAbstract p = new PersonAbstract(); 编译错误，无法实例化抽象类
 * */
abstract class PersonAbstract{
    public abstract void run();
}

/**
 * 从抽象类继承的子类，【必须】实现抽象方法！
 * */
class StudentAbstract extends PersonAbstract{
    @Override
    public void run(){
        System.out.println("StudentAbstract.run");
    }
}
class TeacherAbstract extends PersonAbstract{
    @Override
    public void run() {
        System.out.println("TeacherAbstract.run");
    }
}

/**
 * 如果不实现抽象方法，则该子类仍是一个抽象类。
 * */
abstract class PersonAbstractUndo extends PersonAbstract{
    public abstract void run();
}