/**
 * Create Time: 2021/7/27 15:00
 */

/**
 * 【实例字段】：在class中定义的字段
 * 【静态字段】：用static修饰的字段（static field）
 * 实例字段在每个实例中拥有自己的一个独立空间；
 * 静态字段只有一个共享空间；
 * */
public class Static {
    public static void main(String[] args) {
        PersonStatic hx = new PersonStatic("郝宵",22);
        PersonStatic yzl = new PersonStatic("智琳",21);
        /**
         * 对于静态字段，无论修改哪个实例的静态字段，效果都一样!!
         *
         * 都是修改了所属类的静态字段！
         *
         * 原因是静态字段并不属于实例，属于字段！
         *
         * */
        hx.number = 2;
        System.out.println(hx.name + "," + hx.age + "," + yzl.number);

        yzl.number = 1;
        System.out.println(yzl.name + "," + yzl.age + "," + hx.number);

        PersonStatic.number = 999;
        System.out.println(hx.name + "," + hx.age + "," + hx.number);

    }
}

class PersonStatic {
    public String name;

    public int age;

    public static int number;  //定义静态字段number

    PersonStatic(String name,int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 调用实例方法必须通过一个实例变量，调用静态方法则不需要实例变量，通过类名就可以调用。
     *
     * 静态方法经常用于工具类，例如Arrays.sort()，Math.random()
     *
     * 静态方法也常用于辅助方法，Java程序的入口方法就是main()就是静态方法
     *
     * */
    public static void setNumber(int value) {
        number = value;
    }
}



