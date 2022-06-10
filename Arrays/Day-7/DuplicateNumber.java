class Solution {
    public boolean containsDuplicate(int[] nums) {
       
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])) //to check element already exist or not
            {
                return true;
                
            }
            else{
                map.put(nums[i], 1);
            }
            
            
           
            }
            
        
    return false;
        
        
    }
    }
//1,2,3