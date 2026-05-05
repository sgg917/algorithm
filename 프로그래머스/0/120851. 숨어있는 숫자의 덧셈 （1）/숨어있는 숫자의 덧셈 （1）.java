import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = "";
        for(int i=0; i<my_string.length(); i++){
            str = my_string.substring(i, i+1);
            if(str.matches("[0-9]")){
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}