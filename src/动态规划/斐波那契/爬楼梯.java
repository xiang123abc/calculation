package 动态规划.斐波那契;
/**
 * {@linkplain https://leetcode-cn.com/problems/climbing-stairs/}  
 * @author xiang
 * dp[i]=dp[i−1]+dp[i−2]
 */
public class 爬楼梯 {
	public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
	//方法二
	public int climbStairs2(int n) {
	    if (n <= 2) {
	        return n;
	    }
	    int pre2 = 1, pre1 = 2;
	    for (int i = 2; i < n; i++) {
	        int cur = pre1 + pre2;
	        pre2 = pre1;
	        pre1 = cur;
	    }
	    return pre1;
	}
}
