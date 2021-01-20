package p2869;
// 도움받음
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		double A = Integer.parseInt(token.nextToken());
		double B = Integer.parseInt(token.nextToken());
		double V = Integer.parseInt(token.nextToken());
		
		System.out.println((int)Math.ceil((V-B)/(A-B)));
		

	}

}
