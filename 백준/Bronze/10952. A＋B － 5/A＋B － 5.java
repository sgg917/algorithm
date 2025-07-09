import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int num = 1;
        while(num != 0){
            num = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                num += Integer.parseInt(st.nextToken());
            }
            if(num != 0){
                bw.write(String.valueOf(num) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}