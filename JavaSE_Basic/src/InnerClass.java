/**
 * Create Time: 2021/7/27 18:00
 */

/**
 * Java的内部类可分为Inner Class、Anonymous Class和Static Nested Class三种：
 *
 * Inner Class和Anonymous Class本质上是相同的，都必须依附于Outer Class的实例，即隐含地持有Outer.this实例，并拥有Outer Class的private访问权限；
 *
 * Static Nested Class是独立类，但拥有Outer Class的private访问权限。
 * */

public class InnerClass {
    public static void main(String[] args) {
        //【方法1】要实例化一个内部类，必须先实例化一个外部类；然后调用外部类的new来创建内部类
        Outer outer = new Outer("郝宵");  //实例化一个Outer

        Outer.Inner inner = outer.new Inner();  //实例化一个Inner

        //【方法3】
        OuterStatic.InnerStatic outerStatic = new OuterStatic.InnerStatic();
        outerStatic.hello();
    }


}

/**
 * 【方法1——Inner Class】
 *
 * 如果一个类定义在另一个类的内部，这个类就是Inner Class
 * */
class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("inner.hello " + Outer.this.name);
        }
    }
}

/**
 * 【方法2——Anonymous Class】
 *
 *  不在外部类中明确的定义内部类，而在方法内部通过 匿名类（Anonymous Class） 来定义
 * */
class OuterAnonymous {
    private String name;

    OuterAnonymous(String name) {
        this.name = name;
    }

    /**
     * 观察hello()方法
     * Runnable本身是接口，接口是不能实例化的，所以这里实际上是定义了一个实现了Runnable接口的匿名类，
     * 并且通过new实例化该匿名类，然后转型为Runnable。
     * */
    void hello() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello," + OuterAnonymous.this.name);
            }
        };
        new Thread(runnable).start();
    }
}

/**
 * 【方法3——Static Nested Class】
 *
 * 最后一种内部类和Inner Class类似，但是使用static修饰，称为静态内部类（Static Nested Class）：
 * */
class OuterStatic {
    private String name;

    private static String NAME = "郝宵";

    OuterStatic(String name) {
        this.name = name;
    }

    static class InnerStatic {
        void hello() {
            System.out.println("Hello," + OuterStatic.NAME);
        }
    }
}