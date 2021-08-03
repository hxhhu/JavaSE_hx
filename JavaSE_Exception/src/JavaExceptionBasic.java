import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Create Time: 2021/8/02 16:00
 */
public class JavaExceptionBasic {
    public static void main(String[] args) {
        /**
         * Java内置了一套异常处理机制，总是使用异常来表示错误。
         *
         * 异常本身是一种class，它本身带有类型信息；从Throwable继承；
         *
         * 异常可以在任何地方输出，但只需要在上层捕获；
         *
         * Error是无需捕获的严重错误，Exception是应该捕获的可处理的错误；
         *
         * RuntimeException无需强制捕获，非RuntimeException（Checked Exception）需强制捕获，或者用throws声明；
         *
         * 不推荐捕获了异常但不进行任何处理。
         * */
        try {
            String s = processFile("C:\\test.txt");
        } catch (SecurityException e){
            // no read permission
        } catch (Exception e){
            // other error
        }

        /**
         * 捕获异常使用try catch语句
         *
         * 把可能发生异常的代码放在try{...}中
         * 然后使用catch捕获对应的Exception及其子类
         * */
        byte[] bs = toGBK("中文");
        System.out.println("toGBK(bs): " + Arrays.toString(bs));
    }

    static String processFile(String s){
        String result = new String("test");
        return result;
    }

    static byte[] toGBK(String s){
        try{
            return s.getBytes("GBK");   // 用指定编码将String转换为byte[]
        } catch (UnsupportedEncodingException e) { // 如系统不支持GBK编码，会捕获到UnsupportedEncodingException异常
            /**
             * 在方法定义的时候，使用throws Xxx表示该方法可能抛出的异常类型。
             *
             * public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
             *     ...
             * }
             *
             * 调用方在调用的时候，【必须强制】捕获这些异常，否则编译器会报错。
             *
             * */
            e.printStackTrace();    // 先记录下异常
            return  s.getBytes();   // 尝试使用默认编码
        }
    }
}
