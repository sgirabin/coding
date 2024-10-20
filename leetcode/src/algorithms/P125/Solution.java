class Solution {
    
    public boolean isAlphaNumeric(char c) {
        if (!(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9')) {
			return false;
		}
        
        return true;
    }
    
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            if (isAlphaNumeric(s.charAt(i)) && isAlphaNumeric(s.charAt(j))){
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--; 
            }else {
                if  (!isAlphaNumeric(s.charAt(i))) {
                    i++;
                }
                if  (!isAlphaNumeric(s.charAt(j))) {
                    j--;
                }
            }
        }
        
        return true;
    }
}
