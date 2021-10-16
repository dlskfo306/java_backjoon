package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


// 기찍 N
public class Ex2742 {

    public static void main(String[] args) throws IOException {
        //자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i=N; i>=1; i--) {
            bw.write(i + "\n");
        }
        
        br.close();
        
        bw.flush();
        bw.close();

    }
}
