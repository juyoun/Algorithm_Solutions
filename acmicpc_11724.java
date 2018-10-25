import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
	private static Scanner s;
	static int counter = 0;
	
	public static void main(String args[]){
		s = new Scanner(System.in);
		int N, M;
		N = s.nextInt();
		M = s.nextInt();
		if(N<1 || N>1000){
			System.out.println("N is out of range");
			System.exit(0);
		}
		if (M<0 || M > N*(N-1)/2){
			System.out.println("M is out of range");
			System.exit(0);
		}
		
		int[][] connection = new int[N][N];
		
		for(int i = 0; i< N; i++){
			Arrays.fill(connection[i], 0);
		}
		
		for(int i=0; i<M; i++){
			int a = s.nextInt();
			int b = s.nextInt();
			connection[b-1][a-1] = 1;
			connection[a-1][b-1] = 1;
		}
				
		boolean[] isVisit = new boolean[N];
		Arrays.fill(isVisit, false);
		
		for(int i=0; i<N; i++){
			if(isVisit[i] == false)
				counter++;
				DFS(i, isVisit, N, connection);
		}
		
		System.out.println(counter);
	}


	public static void DFS(int node, boolean[] isVisit, int N, int[][] connection){
		int current_node = node+1;
		isVisit[node] = true;
		for(int i = 0; i < N; i++){
			if(!isVisit[i] && connection[node][i] != 0){
				DFS(i, isVisit, N, connection);
			}
		}
	}
}