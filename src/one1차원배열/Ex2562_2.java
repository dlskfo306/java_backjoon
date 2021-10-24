package one1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;


public class Ex2562_2 {

    public static void main(String[] args) throws IOException {
        // 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
        /*
        예를 들어, 서로 다른 9개의 자연수
        3, 29, 38, 12, 57, 74, 40, 85, 61
        이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
         */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[9];
        int max= arr[0]; 
        int index = 0;
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            //arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max) { 
                max = arr[i];
                index = i;
            }
        }
    
        System.out.println(max);
        System.out.println(index+1);
        
    }
}
