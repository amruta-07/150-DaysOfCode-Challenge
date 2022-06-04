class Solution {
    public int removeDuplicates(int[] nums) {
         int unique=0; //trace unique element in array
     int current=0; //trace current element in array
        while(current<nums.length-1){  //2<2  //uniq 1
            
            if(nums[current]!=nums[current+1]){ //compare with next element  1,2
                nums[unique]=nums[current];
                unique++;
            }
            current++;
        }
        
        if(nums[current]!=nums[unique]){
            nums[unique]=nums[current];
        }
        
        return unique+1;
        
    }
}