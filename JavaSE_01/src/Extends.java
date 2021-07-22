/**
 * Create Time: 2021/7/21 10:00
 */

import javax.annotation.Resource;

/**
 * 【目的】：继承是面向对象编程的一种强大的代码复用方式；
 *
 * 【Object】：在Java中，没有明确写extends的类，编译器会自动加上extends Object
 *
 * 【单继承】：
 *          Java只允许一个class继承自一个类，因此，一个类有且仅有一个父类。只有Object特殊，它没有父类。
 *          Java只允许单继承，所有类最终的根类是Object；
 *
 * 【protected】：protected允许子类访问父类的字段和方法；
 *
 * 【super】：子类的构造方法可以通过super()调用父类的构造方法；
 *
 *            可以安全地向上转型为更抽象的类型；
 *
 * 【instanceof】：可以强制向下转型，最好借助instanceof判断；
 *
 * 子类和父类的关系是is，has关系不能用继承。
 * */
public class Extends {
    public static void main(String[] args) {
        PersonExtends personExtends = new PersonExtends();
        personExtends.setName("郝宵");
        StudentExtends studentExtends = new StudentExtends();
        /**
         *  【向上转型】：如果子类Student是从父类Person继承下来的，一个引用类型为父类的变量，可以指向子类的实例！
         *  【原因】：StudentExtends继承自PersonExtends，因此它拥有PersonExtends的全部功能。
         *  【upcasting】：把一个子类类型安全地变为父类类型的赋值，被称为向上转型（upcasting）。
         *  【继承树】：继承树是Student > Person > Object，所以，可以把Student类型转型为Person，或者更高层次的Object。
         * */
        PersonExtends personExtendsUpCasting = new StudentExtends();
        /**
         *  【向下转型】：
         * */
        PersonExtends p1 = new StudentExtends();
        PersonExtends p2 = new PersonExtends();
        StudentExtends s1 = (StudentExtends) p1;  // OK
        StudentExtends s2 = (StudentExtends) p2;  // runtime error!ClassCastException! 不能把父类变为子类，因为子类功能比父类多，多的功能无法凭空变出来。
        /**
         * 【instanceof】：为避免向下转型出错，Java提供了instanceof操作符，可以先判断一个实例究竟是不是某种类型：
         *                  只有判断成功才会向下转型！
         * 【实质】：instanceof实际上判断一个变量所指向的实例是否是指定类型，或者这个类型的子类。
         * 【null】：如果一个引用变量为null，那么对任何instanceof的判断都为false。
         * */
        PersonExtends p3 = new StudentExtends();
        if (p3 instanceof StudentExtends) {
            // 只有判断成功才会向下转型：
            StudentExtends s3 = (StudentExtends) p3; //一定会成功。
        }
    }
}

/**
 * 【private】： 子类无法访问父类的private字段或者private方法
 *              子类不会继承父类的构造方法，子类默认的构造方法是编译器自动生成的，不是继承的
 * 【阻止继承】：只要一个类不被final修饰，就允许被继承
 * */
class PersonExtends {

    private String name;

    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
/**
* */

class StudentExtends extends PersonExtends {

    public String hello() {
        return "hello," + age;     //OK!
        //return "hello,"+ name;  编译错误，子类无法访问父类的private字段或者private方法
    }

    private int score;

    public int getScore() {
        return score; }

    public void setScore(int score) {
        this.score = score; }
}

/**
 * StudentExtends可以has一个Book实例
 * */
class Book {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * */
class StudentHas extends PersonExtends {
    protected Book book;

    private int score;
}