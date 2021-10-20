package for문;

import java.util.Scanner;

//소수구하기

//1~100까지 소수구하기
public class PrimeNumber {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int count = 0;
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
