package while문;

import java.util.Scanner;

// A+B - 5
public class Ex10952 {

    public static void main(String[] args) {
        // 입력의 마지막에는 0 두 개가 들어온다.
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        while(a > 0 && b < 10) {
            System.out.println(a+b);
            
            a = scanner.nextInt();
            b = scanner.nextInt();
            
            if(a==0 && b==0) {
                scanner.close();
            }
        }
    }
}
