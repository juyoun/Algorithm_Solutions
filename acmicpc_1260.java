import java.util.*;
import java.io.*;

public class Main {
	private static Scanner s;
	static int[][] connection;
	static boolean[] isVisit;
	static int N;
	static int M;
	static int V;

	public static void main(String args[]) throws IOException{
		s = new Scanner(System.in);
		N = s.nextInt();
		M = s.nextInt();
		V = s.nextInt();
		
		connection = new int[N][N];
		isVisit = new boolean[N];
		
		for(int i=0; i<N; i++){
			Arrays.fill(connection[i], 0);
		}
		
		Arrays.fill(isVisit, false);
		
		for(int i=0; i<M; i++){
			int a = s.nextInt();
			int b = s.nextInt();
			connection[a-1][b-1] = 1;
			connection[b-1][a-1] = 1;
		}
		
		DFS(V-1);
		System.out.println();
		
		Arrays.fill(isVisit, false);
		
		
		BFS(V-1);
	}
	
	
	public static void DFS(int node){
		int current_node = node + 1;
		System.out.print(current_node + " ");
		isVisit[node] = true;
		for(int i = 0; i < N; i++){
			if(!isVisit[i] && connection[node][i] != 0){
				DFS(i);
			}
		}
	}
	
	public static void BFS(int node){
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(node);
		isVisit[node] = true;
		int prt = node + 1;
		System.out.print(prt + " ");
		
		int temp;
		while(!q.isEmpty()){
			temp = q.poll();
			for(int i=0; i<N; i++){
				if(connection[temp][i] == 1 && !isVisit[i]){
					q.offer(i);
					isVisit[i] = true;
					int p = i + 1;
					System.out.print(p + " ");
				}
			}
			
		}
	}
}