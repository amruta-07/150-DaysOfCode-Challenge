class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        // int xor1=array[0];
        // for(int i=1; i<n-1; i++)
        // {
            
        //     xor1=xor1^array[i];
            
            
        // }
        // int xor2=1;
        // for(int i=2; i<n+1; i++)
        // {
        //     xor2=xor2^i;
            
        // }
        // return xor1^xor2;
        int total_sum=n*(n+1)/2;
        int sum=0;
        for(int i=0; i<n-1; i++){
            sum+=array[i];
            
        }
        return (total_sum-sum);
    }
}