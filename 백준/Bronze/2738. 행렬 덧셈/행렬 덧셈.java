import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];

        for(int i=0; i<2; i++) {
            for (int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k=0; k<M; k++) {
                    if (i == 0) A[j][k] = Integer.parseInt(st.nextToken());
                    else A[j][k] += Integer.parseInt(st.nextToken());
                }
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                bw.write(String.valueOf(A[i][j]) + " ");
            }
            bw.newLine();
        }
        bw.close();
    }
}