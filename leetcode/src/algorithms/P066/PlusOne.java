
class PlusOne {

   public int[] plusOne(int[] digits) {
 
        digits[digits.length-1] =  digits[digits.length-1] + 1;
        
        int reserved=0;
        for  (int i=digits.length-1;i>=0;i--)  {
            digits[i] =  digits[i] +  reserved;
            if (digits[i]>=10) {
                digits[i]=digits[i]-10;
                reserved=1;
            }else {
                reserved=0;
            }
        }
        
        if (reserved !=0 ) {
            int[] newDigits =  new  int[digits.length+1];
            newDigits[0] =  reserved;
            for (int i=1;i<newDigits.length;i++) {
                newDigits[i]=digits[i-1];
            }
            return newDigits;
        }
        
        return digits;
    }


}
