package p10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		int N = Integer.parseInt(token.nextToken());
		int X = Integer.parseInt(token.nextToken());
		token = new StringTokenizer(reader.readLine(), " ");
		for(int i = 0; i < N; i++) {
			int t = Integer.parseInt(token.nextToken());
			if(t < X) builder.append(t).append(" ");
		}
		System.out.println(builder);
	}
}
