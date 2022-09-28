package regx;

public class StringSplitMethodExample1 {
    public static void main(String[] args) {
        String str = "I love java programming language";
        String [] strArr = str.split("\\s");

        for (String s: strArr){
            System.out.print(s+" ");
            //I love java programming language
        }
        System.out.println();
        System.out.println("---reverse string word printing---");
        // reverse string followed by word...
        for (int i=strArr.length-1; i>=0; i--){
            System.out.print(strArr[i]+" ");
            // language programming java love I
        }
    }
}
