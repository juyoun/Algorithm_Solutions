// https://www.acmicpc.net/problem/1931

import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[][] data;
	static int ANSWER;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ANSWER = 0;
		
		N = Integer.parseInt(br.readLine());
		
		data = new int[N][2];
		
		for( int i=0 ; i<N ; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			data[i][0] = Integer.parseInt(st.nextToken());
			data[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(data, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if ( o1[1] > o2[1] ) return 1;
				else if ( o1[1] == o2[1] ) {
					if ( o1[0] > o2[0] ) return 1;
					return -1;
				}
				return -1;
			}
			
		});	
		
		int last = 0;
		
		for( int i=0 ; i<N ; i++ ) {
			if ( data[i][0] >=  last ) {
				last = data[i][1];
				ANSWER++;
			}
		}
		
		System.out.println(ANSWER);
		
		br.close();
	}

}
