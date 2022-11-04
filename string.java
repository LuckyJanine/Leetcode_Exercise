package Array_String;

public class string {
    // 58
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int lenOfLastWord = 0;
        int i = len -1;
        // remove the lagging spaces
        while(i >= 0){
            if(s.charAt(i) != ' '){
                break;
            }
            i--;
        }
        // start counting
        for(int j = i; j >= 0; j--){
            if(s.charAt(j) == ' '){
                break;
            }
            lenOfLastWord++;
        }
        return lenOfLastWord;
    }
}
