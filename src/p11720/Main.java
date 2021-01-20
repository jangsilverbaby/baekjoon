package p11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String s = reader.readLine();
		String[] array;
		int sum = 0;
		
		array = s.split("");
		
		for(int i = 0; i < N; i++) {
			sum += Integer.parseInt(array[i]);
		}
		System.out.println(sum);
	}

}
