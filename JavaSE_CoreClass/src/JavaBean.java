package src;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * Create Time: 2021/7/30 15:00
 */
public class JavaBean {
    public static void main(String[] args) throws Exception {
        /**
         * 【Introspector】用于枚举JavaBean属性
         * */
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd:beanInfo.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println("----------------------");
            System.out.println(pd.getReadMethod());
            System.out.println("**********************");
            System.out.println(pd.getWriteMethod());
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(pd.getPropertyType());
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }
}

/**
 *  【定义】: 符合以下写法的class称为JavaBean：
 */
class Person {
   private String name;

   private boolean child;

   private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
       return this.name;
   }

   public void setName(String name) {
       this.name = name;
   }

    // boolean的读方法较特殊，命名为isXxx
   public boolean isChild() {
       return child;
   }

   public void setChild(boolean child) {
       this.child = child;
   }
}
/**
 * 【作用】：JavaBean主要用来传递数据，即把一组数据组合成一个JavaBean便于传输。
 *
 * 我们通常把一组对应的读方法（getter）和写方法（setter）称为属性（property）。
 */