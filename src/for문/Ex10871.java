package for문;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

// X보다 작은 수
public class Ex10871 {

    public static void main(String[] args) throws IOException{
        // 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
        // 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
        
        //X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. 
        //X보다 작은 수는 적어도 하나 존재한다.
        
        //Buffered사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        

        st = new StringTokenizer(br.readLine(), " ");
        
        
        for(int i=1; i<=N; i++) {
            int A = Integer.parseInt(st.nextToken());
            if(A < X) {
                bw.write(A + " ");
            }
            
           
        }
        
        br.close();
        bw.flush();
        bw.close();
        
        
        
        /*
        //scanner 사용
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        
        for(int i=1; i<=N; i++) {
            int A = scanner.nextInt();
            if(A < X) {
                System.out.print(A + " ");
            }
        }
    */
       
  
    }
}
