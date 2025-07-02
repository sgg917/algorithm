import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = 0;
        int min = 0;
        int cookingTime = 0;
        int cnt = 0;
        while(st.hasMoreTokens()){
            if(cnt == 0) hour = Integer.parseInt(st.nextToken());
            else         min = Integer.parseInt(st.nextToken());
            cnt++;
        }
        cookingTime = Integer.parseInt(br.readLine());
        br.close();
        
        if(cookingTime > 59){
            hour = hour + (cookingTime / 60);
            min = min + (cookingTime % 60);
        }else{
            min += cookingTime;
        }
        
        if(min > 59){
            min -= 60;
            hour++;
        }
        if(hour > 23){
            hour -= 24;
        }
        bw.write(String.valueOf(hour) + " " + String.valueOf(min));
        
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}