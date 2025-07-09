import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int cnt = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i=1; i<=cnt; i++){
            total = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                total += Integer.parseInt(st.nextToken());
            }
            bw.write("Case #" + String.valueOf(i) + ": " + String.valueOf(total));
            if(i < cnt) bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}