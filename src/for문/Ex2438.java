package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 별찍기 - 1
public class Ex2438 {

    public static void main(String[] args) throws IOException {
        // 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
        // *
        // **
        // ***

        //buffered사용하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();

        
        //scanner 사용하기
         Scanner scanner = new Scanner(System.in);
         
         int n = scanner.nextInt();

         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
         

    }
}
