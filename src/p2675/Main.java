package p2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer token;
		int i, j, k;
		int N = Integer.parseInt(reader.readLine());
		
		for(i = 0; i < N; i++) {
			token = new StringTokenizer(reader.readLine()," ");
			int R =  Integer.parseInt(token.nextToken());
			String S = token.nextToken();
			String[] array = S.split("");
			
			for(j = 0; j < array.length; j++) {
				for(k = 0; k < R; k++) {
					builder.append(array[j]);
				}
			}
			builder.append("\n");
		}
		System.out.println(builder);
		
	}

}
