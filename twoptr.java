package Array_String;

public class twoptr {
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
}