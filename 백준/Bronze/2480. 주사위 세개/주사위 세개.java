//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];
        int max = 0, total = 0, cnt = 0;
        while(st.hasMoreTokens()){
            nums[cnt++] = Integer.parseInt(st.nextToken());
        }
        if(nums[0] == nums[1] && nums[1] == nums[2]){
            total = 10000 + (nums[0] * 1000);
        }else if(nums[0] == nums[1] || nums[0] == nums[2]){
            total = 1000 + (nums[0] * 100);
        }else if(nums[1] == nums[2]){
            total = 1000 + (nums[1] * 100);
        }else{
            for(int i=0; i<nums.length; i++){
                if(nums[i] > max) max = nums[i];
            }
            total = max * 100;
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
    }
}