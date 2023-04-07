class Solution {
    public int getSum(int a, int b) {
        while(b!= 0){
            int temp_xor= a^b;
            int temp_and_shift = a & b;
            a=temp_xor;
            b=temp_and_shift << 1;
        }

        return a;


    }
}
