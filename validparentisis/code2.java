class Solution {
    public boolean isValid(String s) {
        /**
            if i is open bracket 
                Push it to top of stack
            if i is closing bracket and matches opening bracket at top of stack
                then pop both from stack and continue until stack is empty
                return true
            else 
                return false
        */

        // Stack to store left brackets
        Stack<Character> leftBrackets = new Stack<>();

        /** 
        Convert string to char array and use pointer to iterate through array
        As opening brackets are encountered, add them to top of stack
        Every time a closing bracket is encountered that matches opening bracket 
        properly, pop stack 
        Continue until either stack is empty (no more opening brackets to match 
        with closing bracket, return true) or if an error occurs (opening bracket 
        and closing bracket do not match, return false)
        */ 

        for(char i : s.toCharArray()) {
            if(i == '(' || i == '{' || i == '[') {
                leftBrackets.push(i);
            }
            // If right bracket is encountered 
            else if (i == ')' && !leftBrackets.isEmpty() && leftBrackets.peek() == '(') {
                leftBrackets.pop();
            } else if (i == '}' && !leftBrackets.isEmpty() && leftBrackets.peek() == '{') {
                leftBrackets.pop();
            } else if (i == ']' && !leftBrackets.isEmpty() && leftBrackets.peek() == '[') {
                leftBrackets.pop();
            }
            else {
                return false;
            }
        }
        return leftBrackets.isEmpty();

        
    }
}
