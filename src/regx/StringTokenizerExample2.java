package regx;

import java.util.StringTokenizer;

public class StringTokenizerExample2 {
    public static void main(String[] args) {
        String date = "18-10-1999";
        StringTokenizer st = new StringTokenizer(date,"-");

        while (st.hasMoreElements()){
            //System.out.println(st.nextElement());
            System.out.println(st.nextToken());
        }
    }
}
