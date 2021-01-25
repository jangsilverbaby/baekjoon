package p3053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(reader.readLine());
		System.out.printf("%.6f\n%.6f", Math.PI * Math.pow(R, 2), 2 * Math.pow(R, 2));
		
	}

}
