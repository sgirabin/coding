class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> arr = new ArrayDeque<>();
        
        boolean valid=true;
        for (int i=0;i<s.length();i++) {            
            if (s.charAt(i)=='(') {
                valid=false; 
                arr.push(')');
            }else if (s.charAt(i)==')') {
                if (!arr.isEmpty() && arr.getFirst()==')') {
                    valid=true;
                    arr.pop();
                }else {
                    return false;
                }               
            }else if (s.charAt(i)=='[') {
                valid=false;
                arr.push(']');
            }else if (s.charAt(i)==']') {
                if (!arr.isEmpty() && arr.getFirst()==']') {
                    valid=true;
                    arr.pop();
                }else {
                    return false;
                }                 
            }else if (s.charAt(i)=='{') {
                valid=false;
                arr.push('}');
            }else if (s.charAt(i)=='}') {
                if (!arr.isEmpty() && arr.getFirst()=='}') {
                    valid=true;
                    arr.pop();
                }else {
                    return false;
                }                 
            }
            
        }
        
        return valid && arr.isEmpty();
    }
}
