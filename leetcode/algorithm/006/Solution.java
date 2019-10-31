class Solution {
    
    public String convert(String s, int numRows) {
   
        if (numRows==1) {
            return s;
        }
        
        int column = (s.length()/2==0?1:s.length()/2)+1;   
        char[][] arr = new char[numRows][column];
        for (int i=0;i<numRows;i++) {
            for (int j=0;j<column;j++) {
                arr[i][j]=' ';
            }
        }
                
        int x=0; 
        int y=0;
        int ax=0;
        int ay=1;
        int maxY=numRows;
        int minY=0;    
        
        for (int i=0;i<s.length();i++) {    
            arr[y][x] = s.charAt(i);
                        
            if (y+ay>=maxY) {
                ax=1;
                ay=-1;
            }
            
            if (y+ay<minY) {
                ay=1;
                ax=0;
            }
            
            x = x+ax;
            y = y+ay;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<numRows;i++) {
            for (int j=0;j<column;j++) {
                if (arr[i][j] != ' ') {
                    sb.append(arr[i][j]);
                }
            }
        }
        
        return sb.toString().trim();
    }
    
    
}