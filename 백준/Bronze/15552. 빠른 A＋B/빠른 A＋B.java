import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        
        StringTokenizer st = null;
        int total = 0;
        for(int i=0; i<cnt; i++){
            if(i != 0) bw.newLine();
            total = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                total += Integer.parseInt(st.nextToken());
            }
            bw.write(String.valueOf(total));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}