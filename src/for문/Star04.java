package for문;

import java.util.Scanner;

public class Star04 {

    public static void main(String[] args) {
        //  *
        // ***
        //*****
        
        //num=3이라면
        //공백 = num-i;
        //별 수 = (2*i)-1;
        
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        for(int i=1; i<=num; i++) {
            for(int j=1; j<=(num-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    }

}
