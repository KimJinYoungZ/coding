import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) throws IOException 
        {
             

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                StringTokenizer st = new StringTokenizer(br.readLine());

                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());

                int[][] arr = new int[N+1][N+1];
                int[][] D = new int[N+1][N+1];

                for(int i =1; i<=N; i++)
                {
                        st = new StringTokenizer(br.readLine());

                        for(int j =1; j<=N; j++)
                        {
                                arr[i][j]= Integer.parseInt(st.nextToken());
                        }

                }
                for(int i =1; i<=N; i++)
                {

                        for(int j =1; j<=N; j++)
                        {
                                D[i][j] = D[i][j-1] + D[i-1][j] -D[i-1][j-1]+arr[i][j];
                        }

                }
                StringBuilder sb = new StringBuilder();

                for(int i=0; i<M; i++)
                {
                        st= new StringTokenizer(br.readLine());

                        int x1 = Integer.parseInt(st.nextToken());
                        int y1 = Integer.parseInt(st.nextToken());
                        int x2 = Integer.parseInt(st.nextToken());
                        int y2 = Integer.parseInt(st.nextToken());

                        int result = D[x2][y2] - D[x1-1][y2] -D[x2][y1-1] +D[x1-1][y1-1];

                        sb.append(result).append('\n');

                }
                
                System.out.println(sb);

        }


}