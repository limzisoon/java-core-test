public class Compress {

    public StringBuffer compress(String x)
    {
        System.out.println(x);
        StringBuffer result = new StringBuffer();

//        int[] intArr = {1,2,4,5,6};
//        String[] StrArr = {"1","b","4","G"};

        String[] stringArr = x.split("");
        String prevStr="";
        int count = 0;

//        System.out.println("stringArr.length"+stringArr.length);
        for(int i=0;i<stringArr.length;i++)
        {
            if(prevStr.equals(stringArr[i]))
            {
                count = count + 1;
            }
            else
            {
                result.append(stringArr[i]);
                prevStr = stringArr[i];
                count = 1;
            }

            if(i!=stringArr.length-1)
            {
                if(!stringArr[i].equals(stringArr[i+1]))
                    result.append(count);
            }
            else {
                result.append(count);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Compress  c = new Compress();
        System.out.println(c.compress("aabcccccaaa"));
        //expected output is a2b1c5a3
    }
}
