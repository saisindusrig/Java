class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }else{
            int ind=2;
            for(int i=2;i<nums.length;i++){
                if(nums[i]!=nums[ind-2]){
                    nums[ind]= nums[i];
                    ind++;
                }
            }
            return ind;
        }
    }
}