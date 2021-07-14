import java.util.Scanner;

public class HelloWorld {
    /*Java规定，某个类定义的public static void main(String[] args)是Java程序的固定入口方法
      Java程序总是从main方法开始执行*/
    public static void main(String args[]){
        String s = "Hello,郝宵";
        System.out.println(s);
        System.out.println("----------------");

        //可以在定义数组时直接指定初始化的元素
        int[] ints = new int[]{1,2};          //可简写为int[] ints = {1,2};
        System.out.println(ints.length);              //由编译器自动推算数组大小
        System.out.println("----------------");

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

        //if判断
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

    }
}