import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int counter = 0;
		int[] store = new int[2]; // store[0] = a, store[1] = b
		
		// initialize
		if(N<10)
			store[0] = 0;
		else
			store[0] = N / 10;
		
		store[1] = N % 10;
				
		while(true){
			counter ++;
			int temp = store[1];
			store[1] = (store[0] + store[1]) % 10;
			store[0] = temp;
			
			if((10*store[0] + store[1]) == N){
				System.out.println(counter);
				break;
			}
			
		}
	}
}