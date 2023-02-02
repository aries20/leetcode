class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> listmain=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(0,1);
        listmain.add(0,temp);
        for(int i=1;i<numRows;i++){
            List<Integer> previous=new ArrayList<>();
            previous=listmain.get(i-1);
            List<Integer> another = new ArrayList<>();
            another.add(1);
            for(int j=1;j<i;j++){
                another.add(j,(previous.get(j-1)+previous.get(j)));
            }
            another.add(1);
            listmain.add(i,another);
        }
        
        
       
        
        return listmain;

    }
}
