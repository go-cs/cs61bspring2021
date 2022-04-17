/*
 * @Author: your name
 * @Date: 2022-04-16 20:06:32
 * @LastEditTime: 2022-04-16 20:24:52
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \lectureCode\08Inheritance\WordYtils.java
 */
public class WordUtils {
    /**Return the length of the longest word. */
    public static String longest(List61b<String> list ) {
        int maxDog=0;
        for (int i=0;i<list.size();i+=1) {
            String longestString=list.get(maxDog);
            String thisString = list.get(i);
            if (thisString.length()>longestString.length()) {
                maxDog=i;
            }
        }
        return list.get(maxDog);
    }

    public static void main(String[] args) {
        AList<String> someList = new AList<>();
        someList.addLast("elk");
        someList.addLast("are");
        someList.addLast("watcing");
        System.out.println(longest(someList));
    }
}
