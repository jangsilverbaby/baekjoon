package p1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
		StringTokenizer token;
		for(int i = 0; i < T; i++) {
			token = new StringTokenizer(reader.readLine(), " ");
			int X = Integer.parseInt(token.nextToken());
			int Y = Integer.parseInt(token.nextToken());
			int distance = Y - X;
			int max = (int)Math.sqrt(distance);	// 소수점 버림
			 
			if(max == Math.sqrt(distance)) {
				builder.append(2 * max - 1).append("\n");
			}
			else if(distance <= max * max + max) {
				builder.append(2 * max).append("\n");
			}
			else {
				builder.append(2 * max + 1).append("\n");
			}
		}
		System.out.println(builder);
	}

}
