import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int dp[] = new int[N];
        for(int i =0; i<N; i++) {
            dp[i] = 1;
        }
        int answer = Integer.MIN_VALUE;
        for(int i =1; i<N; i++) {
            for(int j = i-1; j>=0; j--) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }

                answer = Math.max(answer,dp[i]);
            }
        }
        System.out.println(answer);

    }
}
