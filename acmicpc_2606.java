// https://www.acmicpc.net/problem/2606

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int counter = 0;
	static boolean isVisited[];
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		
		int[][] connection = new int[V][V];
		
		for(int i = 0; i< V; i++){
			Arrays.fill(connection[i], 0);
		}
		
		for(int i=0; i<E; i++){
			int a = s.nextInt();
			int b = s.nextInt();
			connection[b-1][a-1] = 1;
			connection[a-1][b-1] = 1;
		}
		
		boolean[] isVisit = new boolean[V];
		Arrays.fill(isVisit, false);
		
		
		
		DFS(0, isVisit, V, connection);
		
		
		System.out.println(counter);
	}
	
	public static void DFS(int node, boolean[] isVisit, int N, int[][] connection){
		
		isVisit[node] = true;
		for(int i = 0; i < N; i++){
			if(!isVisit[i] && connection[node][i] != 0){
				DFS(i, isVisit, N, connection);
				counter++;
			}
		}
	}

}
