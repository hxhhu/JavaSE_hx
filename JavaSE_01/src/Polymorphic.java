/**
 * Create Time: 2021/7/26 10:00
 */

public class Polymorphic {
    /**
     * 在继承关系中，子类如果定义了一个与父类方法签名完全相同的方法，被称为覆写（Override）。
     * 例如，在PersonPoly中定义了run()方法；
     * 在子类StudentPloy中，覆写这个run()方法
     * */
}

class PersonPoly {
    String name;
    public void run() {
        System.out.println("This is PersonPoly.run");
    }
}

class StudentPloy extends PersonPoly {
    @Override
    //如果方法签名相同，并且返回值相同，就是Override。加上Override可以让编译器检查是否进行了正确的覆写。
    public void run() {
        System.out.println("This is StudentPoly.run");
    }
    // public void run(String s){...}  不是Override 参数不同
    // public int run(){...}          不是Override 返回值不同
}

/**
 * 覆写Object方法:因为所有的class最终都继承自Object，而Object定义了几个重要的方法：
 *
 * toString()：把instance输出为String；
 * equals()：判断两个instance是否逻辑相等；
 * hashCode()：计算一个instance的哈希值。
 *
 * 在必要的情况下，我们可以覆写Object的这几个方法。例:
 * */
class PersonPolyObject{
    String name;
    @Override   // 显示更有意义的字符串
    public String toString(){
        return "PersonPolyObject:name="+name;
    }

    @Override    // 比较是否相等
    public boolean equals(Object o){
        // 当且仅当o为Person类型:
        if(o instanceof PersonPoly){
            PersonPoly p = (PersonPoly) o;
            // 并且name字段相同时，返回true:
            return this.name.equals(p.name);
        }
        return false;
    }

    @Override   // 计算hash
    public int hashCode(){
        return this.name.hashCode();
    }

}

/**
 * final
 *      用final修饰的类不能被继承;
 *      用final修饰的字段在初始化后不能被修改;
 * */
final class PersonFinal{
    protected int age;
    public final String name = "郝宵";
}