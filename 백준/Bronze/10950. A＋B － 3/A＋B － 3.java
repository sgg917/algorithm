//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//각 테스트 케이스마다 A+B를 출력한다. 각각 다른 줄에.
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int caseCnt = Integer.parseInt(br.readLine());
        int total = 0;
        for (int i=0; i<caseCnt; i++){
            total = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                total += Integer.parseInt(st.nextToken());
            }
            if(i > 0) bw.newLine();
            bw.write(String.valueOf(total));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
