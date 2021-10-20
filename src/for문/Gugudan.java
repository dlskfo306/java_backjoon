package for문;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){
        
        //단 입력하면 그 단 나오게하기
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        for(int i=num; i<=num; i++) {
            for(int j=1; j<=9; j++) {
                System.out.println(num + "*" + j + "=" + (i*j));
            }
        }
        
        
       
    }

}
