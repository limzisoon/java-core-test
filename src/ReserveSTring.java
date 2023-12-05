public class ReserveSTring {
    public static void main(String[] args) {
        String x = "12345";

        String[] strArr =  x.split("");

        System.out.println(strArr.length);

        StringBuffer sb = new StringBuffer();
        for(int i= strArr.length-1;i>=0;i--)
        {
            sb.append(strArr[i]);
        }
        System.out.println(sb.toString());
    }
}
