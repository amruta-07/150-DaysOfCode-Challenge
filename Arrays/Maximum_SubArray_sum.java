class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            int pre_val=0;
            for(int j=i;j<nums.length; j++){
                if( pre_val>=nums[j]){
                    break;
                }
                pre_val=nums[j];
               sum=sum+ nums[j];
                
            }
            max=Math.max(max,sum);//it returns the maximum value
        }
        return max;
        
    }
}