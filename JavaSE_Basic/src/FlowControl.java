/**
 * Create Time: 2021/7/14 10:00
 */
import java.util.Scanner;

public class FlowControl {

    /* Java规定，某个类定义的public static void main(String[] args)或public static void main(String[] args)
       是Java程序固定入口方法，Java程序总是从main方法开始执行 */
    public static void main(String args[]){

        //HelloWorld
        String s = "Hello,郝宵";
        System.out.println(s);
        System.out.println("----------------");

        //int 数组
        int[] ints = new int[]{1,2};          //可以在定义数组时直接指定初始化的元素，可简写为int[] ints = {1,2};
        System.out.println(ints.length);              //由编译器自动推算数组大小
        System.out.println("----------------");

        //string 数组
        String[] strings = new String[]{"刘秀峰","柏汝强"};
        String s1 = strings[1];
        System.out.println(s1);
        System.out.println("----------------");

        //格式化输出
        double d = 3.1415926535;
        System.out.printf("%.2f\n",d);      //  \n换行；%d格式化整数 %f格式化浮点数 %s格式化字符串
        System.out.println("----------------");

        //输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your name:");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("----------------");

        //if-else
        int n = 90;
        if(n>=90)
            System.out.println("成绩优秀");        // 当if语句块只有一行语句时，可省略花括号{}，但不建议省略
        System.out.println("----------------");   // 【注意】这条语句不是if语句块的一部分

        //else if
        int g = 90;
        if(g>=90){
            System.out.println("您的成绩为："+g+"，恭喜优秀！");
        } else if(g>60){
            System.out.println("恭喜及格！");
        } else {
            System.out.println("不及格");
        }
        System.out.println("----------------");

        //switch多重选择
        int option = 1;                             //String fruit = "apple";  switch (fruit){case "apple": ...}
        switch (option){
            case 1:
                System.out.println("Selected 1");
                System.out.println("----------------");
                break;                              //Java12新语法使用->
            case 2:
                System.out.println("Selected 2");
                System.out.println("----------------");
                break;
            case 3:
                System.out.println("Selected 3");
                System.out.println("----------------");
                break;
            //如果switch没有匹配到任何case，则不执行任何语句；但若设置了default，则执行default
            default:
                System.out.println("Not selected");
                System.out.println("----------------");
                break;
        }

        //do while实现1到100求和
        int sum = 0;
        int a = 1;
        do{
            sum =sum +a;
            a++;
        }while(a<=100);
        System.out.println(sum);
        System.out.println("----------------");

        //for实现1到100求和
        int sumf = 0;
        for(int i=0;i<101;i++){
            sumf=sumf+i;
        }
        System.out.println(sumf);
        System.out.println("----------------");

        //for each循环
        int[] ns = {1,2,3};
        //除数组外，for each循环能遍历所有“可迭代”数据类型，包括后面会介绍的List、Map等
        for (int b:ns) {
            System.out.println(b);
        }
        System.out.println("----------------");
        /*  无论是while循环还是for循环，都可以使用break语句和continue语句(通常配合if使用)
            break语句可以跳出当前循环；
            break语句通常配合if，在满足条件时提前结束整个循环；
            break语句总是跳出最近的一层循环；
            continue语句可以提前结束本次循环；
            continue语句通常配合if，在满足条件时提前结束本次循环。 */

        //https://www.liaoxuefeng.com/wiki/1252599548343744/1259541030848864
    }
}