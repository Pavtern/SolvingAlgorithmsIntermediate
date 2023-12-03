/*
70. Climbing Stairs
        Easy
        20.5K
        704
        Companies

        You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



        Example 1:

        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps

        Example 2:

        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step



        Constraints:

        1 <= n <= 45
*/

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 4) return n;
        int result = 1;
        int oneCount = n - 2;
        int twoCount = 1;
        while (oneCount >= 0){
            BigInteger bigInteger = (factorialIterative (oneCount + twoCount).divide(factorialIterative(oneCount).multiply(factorialIterative(twoCount))));
            result += bigInteger.intValue();
            oneCount -= 2;
            twoCount += 1;
        }

        return result;
    }

    public static BigInteger factorialIterative(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
/*
if (n < 4) return n;
        if (n == 4) return 5;
        int result = 1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
        list.add(1);
        }

        int oneCount = n;
        int i = list.size() - 1;
        while (oneCount >= 2){
        if (i == -1 || i == list.size() - 1) {
        list.remove(list.size() - 1);
        list.set(list.size() - 1, 2);
        i = list.size() - 2;
        oneCount -= 2;
        result += 1;
        }
        if(list.get(i) == 1) {
        list.set(i--, 2);
        list.set(i+2,1);
        result += 1;
        }else {
        i = list.size() - 1;
        }
        }
        if (oneCount == 1) {
        result += list.size() - 2;
        } else {
        result += list.size();
        }
        return result;
        */
