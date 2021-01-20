package p10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringTokenizer token = new StringTokenizer(reader.readLine()," ");
		int min = Integer.parseInt(token.nextToken());
		int max = min;
		int next;
		while(token.hasMoreTokens()) {
			next = Integer.parseInt(token.nextToken());
			if(min > next) min = next;
			if(max < next) max = next;
		}
		System.out.printf("%d %d", min, max);
	}

}
