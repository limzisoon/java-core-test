public class CycleRotation {

    public int[] solution(int[] n, int k)
    {
        if(n.length==0 || n.length == k)
        {
            return n;
        }

        for(int i=0; i<k;i++)
        {
            int lastValue = n[n.length-1];

            for(int j=n.length-2;j>=0;j--)
            {
                n[j+1]=n[j];
            }
            n[0]=lastValue;
        }
        return n;
    }

    public static void main(String[] args) {

        CycleRotation t = new CycleRotation();

        int [] intArr = t.solution(new int[]{3,8,9,7,6},3);
        //int [] intArr = t.solution(new int[]{0,0,0},1);
        //int [] intArr = t.solution(new int[]{1,2,3,4},4);
        for(int y : intArr)
        {
            System.out.print(y+" ");
        }
    }


}
