package p11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
		int n = N, i = 2;
		while(n != 1){
			if(n % i == 0) {
				builder.append(i).append("\n");
				n = n / i;
			} else {
				i += 1;
			}
		}
		System.out.println(builder);
	}

}
