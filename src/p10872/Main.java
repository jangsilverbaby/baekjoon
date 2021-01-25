package p10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		System.out.println(factorial(N));
	}
	
	static int factorial(int n) {
		if(n == 0) return 1;
		return n * factorial(n-1);
	}

}
