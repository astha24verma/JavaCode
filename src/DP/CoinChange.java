package DP;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;   // ans - 3 => 5 + 5 + 1
        System.out.println("The fewest/minimum number of coins that you need to make up that amount : " + coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {

        //Recursion
        // int ans = solveRec(coins, amount);


        //DP - Recursion + memoization
        // int[] dp = new int[amount + 1];
        // Arrays.fill(dp, -1);
        // int ans = solveMem(coins, amount, dp);

        //DP - Tabulation i.e. Bottom up approach


        int ans = solveTab(coins, amount);

        // if(ans == Integer.MAX_VALUE){
        //     return -1;
        // }

        return ans;

        // NOT MY CODE - LEARN
        // int[] dp = new int[amount + 1];
        // Arrays.fill(dp, 1, dp.length, amount + 1);

        // for (final int coin : coins)
        //     for (int i = coin; i <= amount; ++i)
        //         dp[i] = Math.min(dp[i], dp[i - coin] + 1);

        // return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public int solveRec(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans = solveRec(coins, amount - coins[i]);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, 1 + ans);
            }
        }

        return mini;

    }


    public int solveMem(int[] coins, int amount, int[] dp) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[amount] != -1) {
            return dp[amount];
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int ans = solveRec(coins, amount - coins[i]);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, 1 + ans);
            }
        }

        dp[amount] = mini;

        return mini;

    }


    public static int solveTab(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            //solving for each amount from 1 -> amount
            for (int j = 0; j < coins.length; j++) {
                // mini = Math.min(mini, 1 + ans);
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                    // ans -> amount - coins[i]
                }
            }
        }

        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[amount];

    }
}
