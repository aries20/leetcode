class Solution {
    public boolean checkparentisis(char a ,char c){
        
       if((a == '{' && c == '}') || (a == '(' && c == ')' ) || (a == '[' && c == ']')){
           return true;
       }  else {
           return false;
       }

    }
     
    public boolean isValid(String s) {
    

        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack =new Stack();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){return false;}
                if(checkparentisis(stack.peek(),c)){
                    stack.pop();
                    continue;
                }else{
                    return false;
                }
                
            }

        }   
        if(!stack.isEmpty()){
            return false;
        }
      
     return true;    
    }
}



