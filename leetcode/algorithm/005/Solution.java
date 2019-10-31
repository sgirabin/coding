class Solution {
    
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while (left<right) {
            
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    public String longestPalindrome(String s) {
        
        if (s.length()<=1) {
            return s;
        }
        
        String palindrome = "" + s.charAt(0);
        
        for (int i=0;i<s.length();i++) {
            int index = 0;
            int start = i;
            while ((index = s.indexOf(s.charAt(i),start+1)) != -1 ) {
                String str = s.substring(i,index+1);
                if (isPalindrome(str)) {
                    if (str.length() > palindrome.length()) {
                        palindrome = str;
                    }
                }
                start=index;
            }
        }
        
        return palindrome;
        
    }
    
}
