package while문;

import java.util.Scanner;

// A+B - 4
public class Ex10951 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextInt()) {
            // .hasNextInt()
            // int면 trun, 아니면 false
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            System.out.println(a+b);           
        }
        scanner.close();
    }
}
