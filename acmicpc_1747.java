import java.util.Scanner;

public class Main {
	private static Scanner s;

	public static boolean isPrime(int num){
		if(num == 1){
			return false;
		}
		for(int i = 2; i < num; i++){
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isPalindrom(int i){
		String temp_str = Integer.toString(i);
		String rev = reverseString(temp_str);
		if(temp_str.equals(rev)){
			return true;
		}
		return false;
	}
	
	public static String reverseString(String s) {
		return (new StringBuffer(s)).reverse().toString();
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int N = s.nextInt();
		int i = N;
		if (N>1000000 || N <1){
			System.out.println("eror: 1 <= N <= 1000000");
			System.exit(0);
		}
		else{
			while (!(isPalindrom(i) && isPrime(i))){
				i++;
			}
			System.out.println(i);
		}
	}
}