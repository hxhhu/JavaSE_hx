/**
 * Create Time: 2021/8/2 16:00
 */
public class MathClass {
    public static void main(String[] args) {
        System.out.println("-100的绝对值： " + Math.abs(-100));  // 100
        System.out.println("1,2的最大值： " + Math.max(1,2));   // 2
        System.out.println("2的10次方： " + Math.pow(2,10) );   // 1024.0
        System.out.println("根号2： " + Math.sqrt(2));   //  1.4142135623730951
        System.out.println("以e为底4的对数： " + Math.log(4));  //  1.3862943611198906
        System.out.println("以10为底1000的对数：" + Math.log10(1000));  // 3.0
        System.out.println("生成一个随机数： " + Math.random());
    }
}
