package p10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		
		BigInteger A = new BigInteger(token.nextToken());
		BigInteger B = new BigInteger(token.nextToken());

		System.out.println(A.add(B));
	
	}

}
