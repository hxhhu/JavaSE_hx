/**
 * Create Time: 2021/7/16 10:00
 */
public class ReferenceParameter {
    public static void main(String[] args){
        PersonExtends person = new PersonExtends();
        int n = 22;
        String name = "郝宵";
        person.setName(name);
        person.setAge(n);
        n = 23;       //此处再对n赋值已经不影响person.setAge的值
        name = "hx";  //此处再对name赋值已经不影响person.setName的值
        System.out.println(person.getName()+"的年龄是："+person.getAge());
        System.out.println("--------------------------");
        System.out.println("重新赋值后的n值为："+n);
        System.out.println("--------------------------");
    }

}
