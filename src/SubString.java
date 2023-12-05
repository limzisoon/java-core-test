public class SubString {
    public static void main(String[] args) {
        String s1="Javatpoint";
        System.out.println(s1.length());
        String substr = s1.substring(0); // Starts with 0 and goes to end
        System.out.println(substr);

        String substr4 = s1.substring(0,4); // Starts with 0 and goes to end
        System.out.println(substr4);

        String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10
        System.out.println(substr2);
//        String substr3 = s1.substring(5,15); // Returns Exception
    }
}