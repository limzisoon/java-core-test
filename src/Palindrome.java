public class Palindrome {

    public boolean solution(String str)
    {
        //corner case
        if(str.equals(" "))
            return true;

        // remove the non-alpha numeric
        StringBuffer sb = new StringBuffer();
        String x = "";
        char[] charArray = str.toCharArray();
        for(char c:charArray)
        {
            if (Character.isLetterOrDigit(c))
            {
                sb.append(c);
            }
        }
        x = sb.toString().toLowerCase();
        System.out.println(x);

        //cut the string into 2 part
        System.out.println(sb.length());
        int div = sb.length()/2;
        String a = x.substring(0,div);
        String b = x.substring(div,x.length());

        System.out.println(a);
        System.out.println(b);

        //reverse the 2nd part
        String originalStr = b;
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string: "+ reversedStr);

        //matching
        if(a.equals(reversedStr))
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.solution("abccba"));
        //System.out.println(p.solution("race a car"));
        //System.out.println(p.solution(" "));
    }
}
