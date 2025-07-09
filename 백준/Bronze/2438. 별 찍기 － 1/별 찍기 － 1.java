import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for(int i=1; i<=cnt; i++){
            for(int j=0; j<i; j++){
                bw.write("*");
            }
            if(i < cnt){
                bw.newLine();
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}