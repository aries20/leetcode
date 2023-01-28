// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;

class HelloWorld {
    
    public static int[] plusOne(int[] a ){
               ArrayList<Integer> list = new ArrayList<>();
               int carry=1;
               int sum=0;
               for(int i=a.length-1;i>=0;i--){
                   
                       sum=a[i] + carry;
                       carry=sum/10;
                       sum=sum%10;
                        list.add(0,sum);
                  }
               if(carry==1){
                   list.add(0,1);
               }
               
               
              int[] primitive = list.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
  
                return primitive;
    }
    
    
    public static void main(String[] args) {
        int[] a = new int[]{1,9,9};
        int[] result= plusOne(a);
        System.out.print(result);
        
    }
}
