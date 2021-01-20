package p2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(reader.readLine());
		int N = Integer.parseInt(reader.readLine());
		int sum = 0, min = 0;
		for(int i = N; i >= M; i--) {
			if(isPrime(i) == true) {
				sum += i;
				min = i;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.printf("%d\n%d", sum, min);
		}
		
	}

	static boolean isPrime(int num) {
		if(num == 1) return false;
		for(int i = 2; i < Math.sqrt(num); i++) if(num % i == 0) return false;
		return true;
	}
}

