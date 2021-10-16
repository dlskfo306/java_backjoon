package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


// A+B - 8
public class Ex11022 {

    public static void main(String[] args) throws IOException {
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        
        //첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        //각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
        
        //각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        int A;
        int B;
        
        StringTokenizer st;
        
        for(int i=1; i<=T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            
            bw.write("Case #"+i+": " + A + " + " + B + " = ");
            bw.write((A+B) + "\n");
 
        }
        
        br.close();
        
        bw.flush();
        bw.close();
    }
}
