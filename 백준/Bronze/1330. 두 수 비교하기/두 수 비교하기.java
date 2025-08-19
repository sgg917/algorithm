//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.
import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[2];
        int cnt = 0;
        while(st.hasMoreTokens()){
            nums[cnt++] = Integer.parseInt(st.nextToken());
        }
        if(nums[0] > nums[1])      bw.write(">");
        else if(nums[0] < nums[1]) bw.write("<");
        else                       bw.write("==");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}