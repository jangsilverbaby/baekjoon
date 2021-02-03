// 하노이의 탑,, 그냥 외우자 ㅎㅎ


package p11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static StringBuilder builder = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		
		builder.append((int)Math.pow(2, num)-1).append("\n");
		hanoi(num, 1, 3, 2);
		System.out.println(builder);

	}

	public static void hanoi(int n, int from, int to, int by) {
		if (n == 1) {
			builder.append(from + " " + to + "\n");
			return;
		} else {
			hanoi(n-1, from, by, to);
			builder.append(from + " " + to + "\n");
			hanoi(n-1, by, to, from);
		}
	
	}

}
