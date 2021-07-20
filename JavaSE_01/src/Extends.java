/**
 * Create Time: 2021/7/20 10:00
 */

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
        Person person = new Person();
        person.setName("郝宵");
        Student student = new Student();
    }
}

/**
 * 【特点】：子类无法访问父类的private字段或者private方法
 * */

class Student extends Person {
    public void Student(){
        
    }

    private int score;

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }
}


