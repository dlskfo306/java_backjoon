package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 별찍기 - 2
public class Ex2439 {

    public static void main(String[] args){
        // 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
        //   *
        //  **
        // ***

    
        //scanner 사용하기
         Scanner scanner = new Scanner(System.in);
         
         int n = scanner.nextInt();
         
         //n=3 이면 
         //첫쨋줄은 공백 2개, * 1개
         //둘쨋줄은 공백 1개, * 2개
         //셋쨋줄은 공백 0개, * 3개
         //따라서 공백은 n-i개, *은 n개가 된다.
      
         /*
         for(int i=1; i<=n; i++) {
             for(int j=1; j<=n; j++) {
                 if(j<=n-i) {
                     System.out.print(" ");
                 }else {
                     System.out.print("*");
                 }       
             }
             System.out.println();
         }
         */
         
         for(int i=1; i<=n; i++) { //총 몇줄인지
             //공백을 담당하는 for문
             for(int j=1; j<=n-i; j++) {
                 System.out.print(" ");
             }
             
             //*을 담당하는 for문
             for(int k=1; k<=i; k++) {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
