package p11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		int T = Integer.parseInt(reader.readLine());
		StringTokenizer token;
		for(int i = 1; i <= T; i++) {
			token = new StringTokenizer(reader.readLine(), " ");
			builder.append("Case #"+i+": ").append(Integer.parseInt(token.nextToken())+Integer.parseInt(token.nextToken())).append("\n");
		}
		System.out.print(builder);
	}

}
