/**
 * Create Time: 2021/7/30 15:00
 */

/**
 * Java使用enum定义枚举类型，它被编译器编译为final class Xxx extends Enum { … }；
 *
 * 通过name()获取常量定义的字符串，注意不要使用toString()；
 *
 * 通过ordinal()返回常量定义的顺序（无实质意义）；
 *
 * 可以为enum编写构造方法、字段和方法
 *
 * enum的构造方法要声明为private，字段强烈建议声明为final；
 *
 * enum适合用在switch语句中。
 * */
public class EnumClass {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office.");
        }
        System.out.println("--------------------------");
        System.out.println("Weekday.MON.name(): " + Weekday.MON.name());   // 返回常量名
        System.out.println("Weekday.SUN.ordinal(): " + Weekday.SUN.ordinal());  // 返回定义常量的顺序。从开始计数。
        System.out.println("--------------------------");
        /**
         * 【更适合switch语句】
         * 枚举类具有有限个常量，更适合用在switch语句中
         * */
        Weekday day2 = Weekday.SUN;
        switch (day2) {
            case MON:
            case TUE:
            case WEN:
            case THU:
            case FRI:
                System.out.println("Today is " + day + ". Work at office!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + day + ". Sleep at home!");
                break;
            default:
                throw new RuntimeException("cannot process" + day2);
        }
    }
}

/**
 * 【区别】通过enum定义的枚举类，和其他的class有什么区别？
 *
 *        没有任何区别！ enum定义的类型就是class，只不过有以下特点：
 *
 *          1、定义的enum类型总是继承自java.lang.Enum，且无法被继承
 *
 *          2、只能定义出enum的实例，而无法通过new操作符创建enum实例；
 *
 *          3、定义的每个实例都是引用类型的唯一实例
 *
 *          4、可以将enum类型用于switch语句
 * */
enum Weekday {
    SUN,MON,TUE,WEN,THU,FRI,SAT;
}
