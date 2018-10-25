// https://www.acmicpc.net/problem/1759

import java.util.*;
public class Main {
	static char[] data;
	static String[] pwList;
	static int pCnt = 0;
	static int L;
	static int C;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		L = s.nextInt();
		C = s.nextInt();
		data = new char[C];
		pwList = new String[1000];
		
		for(int i=0; i<C; i++){
			data[i] = s.next().charAt(0);
		}
		Arrays.sort(data);
		
		back(0, '0', "");
		
		for(int i=0; i<pCnt; i++){
			System.out.println(pwList[i]);
		} 
		
		s.close();
	}
	
	public static void back(int depth, char lastChar, String pw){
		// condition to be terminated

		if(depth == L && isVowel(pw)){
			// if possibility 0 ~ add to list
			pwList[pCnt++] = pw;
			return;
		}
		else{
			for(int i=0; i<C; i++){
				if(data[i] > lastChar ){
					back(depth + 1, data[i], pw + data[i]);
				}
			}
		}
	}
	
	public static boolean isVowel(String s){
		int V = 0;
		for(int i=0; i<L; i++){
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u')
				V++;
		}
		if(V > 0 && (L - V) > 1 ){
			return true;
		}
		else
			return false;
	}
}
