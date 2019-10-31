class Solution {
    public int reverse(int x) {
        
        boolean negative=false;
        if (x<0) {
            x=Math.abs(x);
            negative=true;
        }
        
        String str=String.valueOf(x);
        String reverse = "";
        for (int i=0;i<str.length();i++) {
            reverse = reverse + str.charAt(str.length()-1-i);
        }
        
        int result=0;
        try {
            result=Integer.parseInt(reverse);
            if(negative) {
                result=result*-1;
            }
        }catch(Exception ex) {
            result=0;
        }
        return result;
    }
}
