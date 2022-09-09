class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
         for(int i=0;i<n;i=i+k){
           int left=i;
           int right=Math.min(n-1,i+k-1);
           int temp=0;
           while(left<right){
               temp=arr.get(left);
               arr.set(left,arr.get(right));
               arr.set(right,temp);
               left++;
               right--;
           }
         }
        
    }
}
