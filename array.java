package Array_String;

public class array {
    // 169. majority element
    // input: an array of numbers which has the majority element
    // Moore's voting algorithm
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int counter = 1;
        for(int i = 1; i < nums.length; i++){
            if(counter == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                counter++;
            } else {
                counter--;
            }
        }
        return candidate;
    }
}
