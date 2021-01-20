package p1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean prime[];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		StringBuilder builder = new StringBuilder();
		
		int M = Integer.parseInt(token.nextToken());
		int N = Integer.parseInt(token.nextToken());
		prime = new boolean[N+1];
		getPrime();
		for(int i = M; i <= N; i++) {
			if(prime[i] == false) builder.append(i).append("\n");
		}	
		System.out.println(builder);
	}
	
	public static void getPrime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i < Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * 2; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
