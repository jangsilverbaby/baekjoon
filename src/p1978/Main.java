package p1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		int result = 0;
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(token.nextToken());
			if(isPrime(n) == true) result++;
		}
		System.out.println(result);
	}
	
	static boolean isPrime(int n) {
		if(n == 1) return false;
		for(int i = 2; i < n; i++) {		    
			if(n % i == 0) return false;        
		}
		return true;
	}

}
