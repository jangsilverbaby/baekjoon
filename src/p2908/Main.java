package p2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		StringBuilder builder1 = new StringBuilder();
		StringBuilder builder2 = new StringBuilder();
		String a = token.nextToken();
		String b = token.nextToken();
		int A = 0,B = 0;
		for(int i = 2; i >= 0; i--) {
			A = Integer.parseInt(builder1.append(a.charAt(i)).toString());
			B = Integer.parseInt(builder2.append(b.charAt(i)).toString());
		}		
		System.out.println(A > B ? A:B);
	}

}
