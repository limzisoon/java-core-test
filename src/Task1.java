import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public String solution(String S)
    {
        Map<Character,Integer> charCountMap = new HashMap<>();

        for(char c: S.toCharArray())
        {
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);

            if(charCountMap.get(c)==2)
            {
                return c+"";
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Task1 bg = new Task1();
        System.out.println(bg.solution("aba"));
        System.out.println(bg.solution("zz"));
        System.out.println(bg.solution("codility"));

    }
}
