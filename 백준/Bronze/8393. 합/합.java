import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.parseInt(br.readLine());
        br.close();
        
        int total = 0;
        for(int i=1; i<=max; i++){
            total += i;
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}