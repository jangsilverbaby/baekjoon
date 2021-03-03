package p7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringTokenizer token;
		int[][] a = new int[N][2];
		int k;

		for(int i = 0; i < N; i++) {
			token = new StringTokenizer(reader.readLine(), " ");
			a[i][0] = Integer.parseInt(token.nextToken());
			a[i][1] = Integer.parseInt(token.nextToken());
		}

		for(int i = 0; i < N; i++) {
			k = 0;
			for(int j = 0; j < N; j++) {
				if (i != j) {
					if (a[i][0] < a[j][0] && a[i][1] < a[j][1]) {
						k++;
					}
				}
			}
			k += 1;
			System.out.print(k + " ");
		}
	}
}
