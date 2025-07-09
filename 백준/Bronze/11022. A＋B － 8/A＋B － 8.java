import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int cnt = Integer.parseInt(br.readLine());
        int first = 0; int second = 0;
        for(int i=1; i<=cnt; i++){
            first = 0; second = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                if(first == 0) first = Integer.parseInt(st.nextToken());
                else           second = Integer.parseInt(st.nextToken());
            }
            bw.write("Case #" + String.valueOf(i) + ": " + String.valueOf(first) 
                     + " + " + String.valueOf(second) + " = " + String.valueOf(first + second));
            if(i<cnt) bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}