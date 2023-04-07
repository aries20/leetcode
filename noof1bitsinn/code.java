public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
       /*  Different approach with time complexity O(1) this takes 32 time 
for loop;
        int bitmask =1;
        int result =0;
    
        for(int i=0;i<32;i++){        
            
            if((n & bitmask) != 0){
                result++;             
            }
            bitmask =bitmask<<1;
        }
        return result; */
       
	 int count=0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;

    }
}
