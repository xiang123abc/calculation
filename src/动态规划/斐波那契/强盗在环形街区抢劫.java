package 动态规划.斐波那契;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * 
 * @author xiang
 * @link  https://leetcode-cn.com/problems/house-robber-ii/description/
 */

public class 强盗在环形街区抢劫 {

	public int rob(int[] nums) {
		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return nums[0];
	//	return Math.max(rob2(Arrays.copyOfRange(nums,0,nums.length-2 )), rob2(Arrays.copyOfRange(nums,1,nums.length-1 )));
		return Math.max(rob(nums,0,nums.length-2), rob(nums,0,nums.length-1));
	}
	public int rob(int[] nums,int left,int right) {
		int pre2 = 0,pre1=0;
		for(int i = left;i<right;i++){
			int cur = Math.max(pre2+nums[i], pre1);
			 pre1 =  cur;
			 pre2 =  pre1;
		}
		return pre1;
	}
	public int rob2(int[] nums) {
		int pre2 = 0,pre1=0;
		for(int i = 0;i<nums.length;i++){
			int cur = Math.max(pre2+nums[i], pre1);
			 pre1 =  cur;
			 pre2 =  pre1;
		}
		return pre1;
	}
	    public int climbStairs(int n) {
	        return climb_Stairs(0, n);
	    }
	    public int climb_Stairs(int i, int n) {
	        if (i > n) {
	            return 0;
	        }
	        if (i == n) {
	            return 1;
	        }
	        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
	    }

	
}
