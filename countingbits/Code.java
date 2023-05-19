class Solution {
    public int[] countBits(int n) {
        int[] ans= new int[n+1];
        for(int i=0;i<n+1;i++){
            ans[i]=getBits(i);
        }
        return ans;

    }
    public int getBits(int num){
        int count = 0;
        while(num!=0){
            num=num&(num-1);
            count++;
        }
        return count;
    } 


}
