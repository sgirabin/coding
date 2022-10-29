class Solution {
    public boolean isNumber(String s) {
        if(s.endsWith("f")|| s.endsWith("D")||s.endsWith("d")){
            return false;
        }
        try{
            Double val = Double.parseDouble(s);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
