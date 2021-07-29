/**
 * Create Time: 2021/7/29 15:00
 */

/**
 * 用分隔符拼接数组的需求很常见，所以Java标准库还提供了一个StringJoiner来干这个事：
 *
 * 用指定分隔符拼接字符串数组时，使用StringJoiner或者String.join()更方便；
 *
 * 用StringJoiner拼接字符串时，还可以额外附加一个“开头”和“结尾”。
 * */

public class StringJoiner {
    public static void main(String[] args){
        String[] names = {"郝宵","智琳"};
        /**
         * 【StringJoiner】
         *      【delimiter】分割
         *      【prefix】开头 (可加可不加)
         *      【suffix】结尾 (可加可不加)
         * */
        java.util.StringJoiner sj = new java.util.StringJoiner(" , ","Hello , ","!");
        for (String name:names){
            sj.add(name);
        }
        System.out.println(sj.toString());

        /**
         * 【String.join()】
         *          String还提供了一个静态方法join()
         *
         *          这个方法在内部使用了StringJoiner来拼接字符串
         *
         *          在不需要指定“开头”和“结尾”的时候，用String.join()更方便：
         * */
        System.out.println(String.join(",",names));
    }
}
