// 2 * 1 = 2
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<=9; i++){
            if(i > 1) bw.newLine();
            bw.write(String.valueOf(num) + " * " + String.valueOf(i) + " = " + String.valueOf(num * i));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}