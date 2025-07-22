// Maximum Sum Subarray of Size K.

/* Problem Statement:
      Given an array Arr of size N and an integer K, return the maximum sum of any contiguous subarray of size K.  */

public class Solution{
  public int maxSum(int[] nums, int k){
    int n = nums.length;
    int max = 0;
    int sum = 0;
    int i = 0;
    int j = 0;

    // create window 
    while(j<k){
      sum = sum + nums[j];
      j++;
    }
    max = sum;

    // sliding window
    while(j<n){
      sum = sum - nums[i] + nums[j];
      max = Math.max(max,sum);
      i++;
      j++;
    }
    return max;
  }
}
  
