package p9020;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static boolean prime[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		prime = new boolean[10001];
		getPrime();
		StringBuilder builder = new StringBuilder();
		for(int t = 0; t < T; t++) {
			int n = scanner.nextInt();
			int a = n/2, b = n/2;

			while(true) {
				if(!prime[a] && !prime[b]) {
					builder.append(a+" "+b+"\n");
					break;		
				}
				a--;
				b++;

			}
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
