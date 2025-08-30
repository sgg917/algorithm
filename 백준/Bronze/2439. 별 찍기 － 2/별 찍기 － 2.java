import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<=num; i++){
            if(i != 1){
                bw.newLine();
            }
            for(int j=1; j<=num-i; j++){
                bw.write(" ");
            }
            for(int j=1; j<=i; j++){
                bw.write("*");
            }
        }
        bw.flush();
        bw.close();
    }
}