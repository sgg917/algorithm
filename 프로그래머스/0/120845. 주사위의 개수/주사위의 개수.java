class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int boxLen : box){
            answer *= boxLen / n;
        }
        return answer;
    }
}