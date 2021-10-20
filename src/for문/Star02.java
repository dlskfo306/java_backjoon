package for문;

import java.util.Scanner;

public class Star02 {
    public static void main(String[] args) {
        
        //  *
        // **
        //***
        
        Scanner scanner= new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        for(int i=1; i<=num; i++) {
            //space = num-i;
            for(int j=1; j<=num; j++) {
                if(j<=num-i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        
    }

}
