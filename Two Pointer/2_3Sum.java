// LC - 015 3Sum

/*
1. Sort nums
2. i = 0; l=i+1; r=n-1;
// check if i == i-1 then skip curr because we have done it's calculation in past 
3. sum = nums[i] + nums[l] + nums[r]
4. if sum==0 then add in list and also check if l == l+1 and r == r-1 if yes then skip them 
5. if sum > 0 the r-- else if sum < 0 l++
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;

            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];

                if(sum==0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if(sum>0) r--;
                else l++;
            }
        }
        return res;
    }
}



/*
My first method ---> wrong

for(i=0->n){
  Apply 2 sum
}

Above method can not solve duplicates

*/
