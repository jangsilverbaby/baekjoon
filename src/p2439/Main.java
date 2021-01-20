package p2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		int N = Integer.parseInt(reader.readLine());
		for(int i = 0; i < N; i++) {
			for(int k = N-1; k > i ; k--) builder.append(" ");
			for(int j = 0; j <= i; j++) builder.append("*");			
			builder.append("\n");
		}
		System.out.println(builder);
	}

}
