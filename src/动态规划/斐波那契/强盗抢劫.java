package 动态规划.斐波那契;
/**
 * https://leetcode-cn.com/problems/house-robber/description/
 * @author xiang
 *
 */
public class 强盗抢劫 {
	public int rob(int[] nums) {
	    int pre2 = 0, pre1 = 0;
	    for (int i = 0; i < nums.length; i++) {
	        int cur = Math.max(pre2 + nums[i], pre1);
	        pre2 = pre1;
	        pre1 = cur;
	    }
	    return pre1;
	    
	}
}
