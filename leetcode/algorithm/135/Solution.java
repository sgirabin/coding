public class Solution {
    public int candy(int[] ratings) {
        int total=0;  
        
        int[] candies = new int[ratings.length];
        for (int i=0;i<candies.length;i++) {
            candies[i]=1;
        }
        
        for (int i=1;i<ratings.length;i++) {
             if (ratings[i]==ratings[i-1] && candies[i-1]!=1 && candies[i]!=1) {
                 candies[i]=1;
             }
             if (ratings[i]>ratings[i-1]) {
                 candies[i]=candies[i-1]+1;
             }
        }
        
        for (int i=ratings.length-1;i>=0;i--) {
             if (i>0 && ratings[i-1]>ratings[i] && candies[i-1]<=candies[i]) {
                 candies[i-1]=candies[i]+1;
             }
             total=total+candies[i];
        }        
 
        return total;
    }
}
