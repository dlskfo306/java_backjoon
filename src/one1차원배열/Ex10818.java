package one1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10818 {

    public static void main(String[] args) {
        //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
        
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        int arr[] = new int[num];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[num-1]);

    }

}
