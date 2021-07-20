/**
 * Create Time: 2021/7/19 10:00
 */
public class ConstructionMethod {
    public static void main(String[] args) {
    }
}

class Persons {

    private String name;

    private int age;

    /**
     * 【初始化实例】：创建实例的时候，实际上是通过构造方法来初始化实例
     * 【构造方法名】：构造方法如此特殊，所以构造方法的名称 = 类名
     * 【默认构造方法】：如果一个类没有定义构造方法，编译器会自动生成一个默认构造方法，它没有参数，也没有执行语句
     * 【自定义】：但如果我们自定义了一个构造方法，那么，编译器就不再自动创建默认构造方法
     * 【个数】：构造方法不止一个，编译器会根据入参自动匹配
     * */

    /** 2个入参构造方法 */
    Persons(String name,int age) {
        this.name = name;
        this.age = age;
    }

    /** 1个入参构造方法 */
    Persons(String name) {
        this.name = name;
        this.age = 22;
    }

    /** 1个入参构造方法 */
    Persons(int age) {
        this.name = "郝宵";
        this.age = age;
    }

    /** 0个入参构造方法 */
    Persons() {
    }
}