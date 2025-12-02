import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            int total = 0;
            st = new StringTokenizer(br.readLine());
            if(st.hasMoreTokens()){
                String[] arr = st.nextToken().split(",");
                for(String str : arr){
                    total += Integer.parseInt(str);
                }
                bw.write(String.valueOf(total));
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}