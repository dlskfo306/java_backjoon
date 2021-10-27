package one1차원배열;

import java.util.Scanner;

public class Ex2577 {

    public static void main(String[] args) {
        // 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
        // 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
        
        // 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
        // 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
        
        // 첫번째 줄엔 0의 총 갯수 
        // 2~ 부턴 1~9까지 차례대로 몇개 쓰였는지 출력
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        scanner.close();
        
        int [] count = new int[10];
        int value = a*b*c;
        
        while(value > 0) {
            count[value % 10]++;
            // 1의자리 체크
            // 만약 1의자리가 0이면 count[0]이 추가
            
            value = value/10;
            // 마지막 1의자리 체크했으니 버리고 나머지 몫 저장
        }
        
        for(int i=0; i<count.length; i++) {
            System.out.println(count[i]);
        }
    }
}
