class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> a=new ArrayList<>();
        int last=digits[digits.length-1];
        a.add((last+1)%10);         //
        int ans=((last+1)/10);
        for(int i=digits.length-2; i>=0; i--){
            if(ans>0){
                a.add((digits[i]+ans)%10);
                ans=((digits[i]+ans)/10);
            }
            else{
                a.add(digits[i]);
            }

            
        }
        if(ans>0){
            a.add(ans);
        }
        int[]arr=new int[a.size()];   //[2,2,3,4]
        int j=0;
        for(int i=a.size()-1; i>=0; i--)  
        {
            arr[j]=a.get(i);         //[4322]
            j++;
        }
        return arr;
       
    }
}
// [8,9]
//9+1%10=0
// 9+1/10=1   
//[2,2,3,4]
//[4322]