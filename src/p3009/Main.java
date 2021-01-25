package p3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		token = new StringTokenizer(reader.readLine(), " ");
		int x1 = Integer.parseInt(token.nextToken());
		int y1 = Integer.parseInt(token.nextToken());

		token = new StringTokenizer(reader.readLine(), " ");
		int x2 = Integer.parseInt(token.nextToken());
		int y2 = Integer.parseInt(token.nextToken());

		token = new StringTokenizer(reader.readLine(), " ");
		int x3 = Integer.parseInt(token.nextToken());
		int y3 = Integer.parseInt(token.nextToken());

		int x = 0, y = 0;

		if(x1 == x2) {
			x = x3;
		}else if(x1 == x3) {
			x = x2;
		}else {
			x = x1;
		}


		if(y1 == y2) {
			y = y3;
		}else if(y1 == y3) {
			y = y2;
		}else {
			y = y1;
		}

		System.out.printf("%d %d", x, y);

	}

}
