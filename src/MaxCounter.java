public class MaxCounter {

    public int jump(int x, int y, int d)
    {
        int distance = y - x;
        int jump = (int) Math.ceil((double)distance/(double)d) ;
        return jump;
    }

    public static void main(String[] args) {

        MaxCounter t = new MaxCounter();
        System.out.println(t.jump(10,85,30));
        System.out.println(t.jump(10,10,30));
        //t.ceil();
    }

    public int ceil()
    {
        System.out.println(Math.ceil(2.0));
        System.out.println((int)Math.ceil(2.44));
        return 0;
    }
}
