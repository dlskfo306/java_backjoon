package if문;

import java.util.Scanner;

//두 수 비교하기
public class Ex1330{
    public static void main(String[] args) {
        //첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
        //-10,000 ≤ A, B ≤ 10,000
        /*
        A가 B보다 큰 경우에는 '>'를 출력한다.
        A가 B보다 작은 경우에는 '<'를 출력한다.
        A와 B가 같은 경우에는 '=='를 출력한다.
        */
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
       
        if(a >= -10000 && b <= 10000) {
            if(a > b) {
                System.out.println(">");
            }else if(a < b) {
                System.out.println("<");
            }else if(a == b) {
                System.out.println("==");
            }
        }
    }
}