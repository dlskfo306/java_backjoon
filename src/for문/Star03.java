package for문;

import java.util.Scanner;

public class Star03 {

    public static void main(String[] args) {
        //*****
        // ****
        //  ***
        //   **
        //    *
        
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        //별의 갯수 = num-i+1
        //공백의 갯수 = i-1
        
        for(int i=1; i<=num; i++) {
            for(int j=1; j<=num; j++) {
                if(i<=j) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
