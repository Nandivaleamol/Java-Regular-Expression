package regx;

import java.util.StringTokenizer;

public class StringTokenizerExample1 {
    public static void main(String[] args) {
        String str = "Ankuli is good girl but angry mind set girl";
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
