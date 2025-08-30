import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        String str = "";
        int cnt = 0;
        while((str = br.readLine()) != null){
            st = new StringTokenizer(str);
            cnt = 0;
            while(st.hasMoreTokens()){
                cnt += Integer.parseInt(st.nextToken());
            }
            bw.write(String.valueOf(cnt));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
