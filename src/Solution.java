import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        // Write your code here
        for(int i=1;i<n+1;i++)
        {
            int fb1 = i%3;
            int fb2 = i%5;

            if(fb1==0 && fb2==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(fb1==0 && fb2>0)
            {
                System.out.println("Fizz");
            }
            else if(fb1>0 && fb2==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
