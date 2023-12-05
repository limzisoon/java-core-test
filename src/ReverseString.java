public class ReverseString {
    public static void main(String[] args) {

        //Reverse String
        String str = "Independent";
        StringBuffer bf = new StringBuffer();
        char[] charArr = str.toCharArray();

        for(int i = charArr.length-1;i>=0;i--)
        {
            bf.append(charArr[i]);
        }
        System.out.println(bf.toString());
    }
}
