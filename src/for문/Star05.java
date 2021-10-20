package for문;

import java.util.Scanner;

public class Star05 {

    public static void main(String[] args) {
        //*****
        // ***
        //  *
        
        //num=3이라면
        //공백=i-1
        //별 갯수 = (num-i)*2+1
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        
        for(int i=1; i<=num; i++) {
            for(int j=1; j<=(i-1); j++) {
                System.out.print(" ");
            }
            
            for(int j=1; j<=(num-i)*2+1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    }

}
