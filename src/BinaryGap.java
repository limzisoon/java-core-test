import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    public int solution(int n)
    {
/*
        //String x = Integer.toBinaryString(n);
        String x = Integer.toString(n,2);
        System.out.println(n);
        System.out.println(x);

        String[] stringArr = x.split("");
        int count=0;
        List<String> oneList = new ArrayList<>();

        for(int i=0;i<stringArr.length;i++)
        {
            if(stringArr[i].equals("1"))
                oneList.add(stringArr[i]);
        }

        if(oneList.size()>1)
        {
            for(int i=0;i<stringArr.length;i++)
            {
                //System.out.print(stringArr[i]);
                if(stringArr[i].equals("0"))
                {
                    count++;
                    if(i != stringArr.length-1)
                    {
                        if(stringArr[i+1].equals("1"))
                            break;
                    }
                }
            }
        }
        System.out.println(count);

        return count;
 */
        String x = Integer.toBinaryString(n);
        System.out.println(x);

        boolean start = false;
        int counter = 0;
        int maxCount = 0;
        for(int i=0;i<x.length();i++)
        {
            String c = x.substring(i,i+1);
            if(c.equals("1"))
            {
                if(start)
                {
                    if(counter > maxCount)
                    {
                        maxCount = counter;
                    }
                }
                counter = 0;
                start = true;
            }

            if(c.equals("0"))
            {
                counter++;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        BinaryGap bg = new BinaryGap();

        //        String x = Integer.toBinaryString(529);
//        String x = Integer.toBinaryString(20);
//        String x = Integer.toBinaryString(15);
//        String x = Integer.toBinaryString(32);
//        String x = Integer.toBinaryString(1041);
//        String x = Integer.toBinaryString(1162);

        System.out.println(bg.solution(1162));
    }
}
