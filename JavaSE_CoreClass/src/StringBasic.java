package src;

/**
 * Create Time: 2021/7/29 8:00
 */

public class StringBasic {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "a";
        System.out.println(s1 == s2);                   // false
        System.out.println(s1.equals(s2));              // false
        System.out.println(s1.equalsIgnoreCase(s2));    // true  要忽略大小写的字符串比较，用equalsIgnoreCase()
        System.out.println("".isEmpty());               // true
        System.out.println(" ".isEmpty());              // false
        System.out.println("------------------------------------");
        /**
         * 【其他类型转为字符串】valueof()
         *
         * 把任意基本类型转换为字符串，可以使用静态方法valueof()
         *
         * 这是一个重载方法，编译器会根据入参选择合适的方法
         * */
        System.out.println(String.valueOf(123));      // "123"
        System.out.println(String.valueOf(121.36));   // "121.36"
        System.out.println("------------------------------------");
        /**
         * 【字符串转为其他类型】
         * */
        System.out.println(Integer.parseInt("123"));        // 123
        System.out.println(Boolean.parseBoolean("TRUE"));   // true
        System.out.println(Boolean.parseBoolean("TRU"));    // false
        System.out.println("------------------------------------");
        char[] cs = "hello".toCharArray();              // String -> char[]
        System.out.println(cs);
        String s = new String(cs);                      // char[] -> String
        System.out.println(s);
        System.out.println("------------------------------------");
    }
}
