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
    
    // sum with two numbers
    // input: an array of integers
    // feedback: cannot see leetcode test inputs, what should it return when there isn't such a sum
    public int[] twoSum (int[] nums, int target) {
        int[] op = new int[2];
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int temp = target - nums[i];
            for(int j = i +1; j < len; j++){
                if(nums[j] != temp){
                    continue;
                }
                op[0] = i;
                op[1] = j;
            }
        }
        return op;
    }
}
