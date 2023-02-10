class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
    if( m ==0 ){
         for(int i=0;i<n;i++){
             nums1[i]=nums2[i];
         }

    }
    else if( n!=0 ){ 
        
        int L[] = new int[m];
        int R[] = nums2; 
        
        for(int i=0;i<m;i++){
            L[i]= nums1[i];
        }

        int k=0;
        int i=0;
        int j=0;

        while(i < m && j < n ){
            if(L[i] <= R[j]){
                nums1[k] = L[i];
                i++;
            }
            else{
                nums1[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<m){
            nums1[k] = L[i];
            i++;
            k++;
        }

        while(j< n){
            nums1[k] = R[j];
            j++;
            k++;
        }


    }

        
    }
}
