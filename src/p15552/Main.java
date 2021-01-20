package p15552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		int T = Integer.parseInt(reader.readLine());
		StringTokenizer token;
		for(int i = 0; i < T; i++) {
			token = new StringTokenizer(reader.readLine(), " ");
			builder.append(Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken()));
			builder.append("\n");
		} 
		reader.close();
		System.out.println(builder);
	}
}
