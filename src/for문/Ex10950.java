package for문;

import java.util.Scanner;

// A+B - 3
public class Ex10950 {

    public static void main(String[] args) {
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        
        //첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        //각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
        
        //각 테스트 케이스마다 A+B를 출력한다.
        
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        int sum[] = new int[T];
        
        for(int i=0; i<T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            sum[i] = a+b;
            //System.out.println(a+b);
        }
        scanner.close();
        
        for(int j : sum) {
            System.out.println(j);
        }
  
    }
}
