import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine()); // 총 금액
        int cnt = Integer.parseInt(br.readLine()); // 구매한 물건의 종류의 수
        int tmpTot = 0;
        int tmpPrice = 0; int tmpCnt = 0;
        
        StringTokenizer st = null;
        for(int i=0; i<cnt; i++){
            tmpPrice = 0;
            tmpCnt = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                if(tmpPrice == 0) tmpPrice = Integer.parseInt(st.nextToken());
                else tmpCnt = Integer.parseInt(st.nextToken());
            }
            tmpTot += tmpPrice * tmpCnt;
        }
        br.close();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(total == tmpTot ? "Yes" : "No");
        bw.flush();
        bw.close();
    }
}