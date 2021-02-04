package p2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		token = new StringTokenizer(reader.readLine(), " ");
		int[] array = new int[N];

		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(token.nextToken());
		}

		System.out.println(max(array, M));
	}
	
	static int max(int[] a, int M) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int p1 = 0; p1 < a.length - 2; p1++) {
			for(int p2 = p1 + 1; p2 < a.length - 1; p2++) {
				for(int p3 = p2 + 1; p3 < a.length; p3++) {
					sum = a[p1] + a[p2] + a[p3];
					if(sum > max && sum <= M) max = sum;
				}
			}
		}
			
		return max;
	}

}
