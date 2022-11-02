package Array_String;

public class twoptr {
    
    // input: an array of chars
    public void reverseString(char[] s) {
        if(s.length == 0|| s.length == 1){
            System.out.println("there is nothing to swap");
        }
        int i = 0;
        int j = s.length -1;
        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    
    // input: an array of binary numbers
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNumberOfOnes =0;
        int counter = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] == 1){
                counter = counter +1;
                if(counter > maxNumberOfOnes){
                    maxNumberOfOnes = counter;
                }
            } else {
                counter = 0;
            }
        }
        return maxNumberOfOnes;
    }
}
