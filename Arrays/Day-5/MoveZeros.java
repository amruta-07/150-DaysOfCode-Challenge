class Solution {
    public void moveZeroes(int[] nums) {
        int non_zero=0;
        for(int start=0; start<nums.length; start++){
            if(nums[start]!=0){
                nums[non_zero]=nums[start];
                non_zero++;
               
            }
            
        }
        for(int end=non_zero; end<nums.length; end++){
            nums[end]=0;
        }
        
         
    }
}