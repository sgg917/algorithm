class Solution {
    public int solution(int[] numbers) {
        int max1th = 0;
        int max2nd = 0;
        for(int number : numbers){
            if(number > max1th){
                max2nd = max1th;
                max1th = number;
            }else if(number > max2nd){
                max2nd = number;
            }
        }
        return max1th * max2nd;
    }
}