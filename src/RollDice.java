import java.util.Arrays;

public class RollDice {

    public int[] solution(int[] A, int F, int M)
    {
        int N = A.length;
        int sum = Arrays.stream(A).sum();
        int totalR = N + F;

        int targetSum = M * totalR;
        int missingSum = targetSum - sum;

        if(missingSum <  F || missingSum > F*6)
        {
            return new int[]{0};
        }

        int[] result = new int[F];
        Arrays.fill(result,1);

        missingSum = missingSum - F;

        for(int i=0; i<F;i++)
        {
            while(missingSum > 0 && result[i] < 6)
            {
                result[i]++;
                missingSum--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RollDice bg = new RollDice();

        int[] resultArr = bg.solution(new int[]{3,2,4,3},2,4);
        System.out.println(Arrays.toString(resultArr));
    }
}
