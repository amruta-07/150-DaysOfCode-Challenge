class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap <Integer, Integer> hs=new HashMap<>();
        
        if(nums.length<=2){
            return false;
        }
        
        for (int i=0; i<nums.length-1; i++){
            if(hs.containsKey(nums[i]+nums[i+1])){
                // hs.put(nums[i]+nums[i+1], hs.get(nums[i]+nums[i+1])+1);
                return true;
            }
            else{
                hs.put(nums[i]+nums[i+1], 1);
            }
            
        }
        for(int i: hs.keySet() ){
            if(hs.get(i)>1){
                return true;
            }
            
        }
        return false;
        
        
    }
}