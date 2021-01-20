package p1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		double[] score = new double[N];
		double max, sum = 0;
		
		for(int i = 0; i < N; i++) score[i] = Double.parseDouble(token.nextToken());
		
		max = score[0];
		for(int i = 1; i < N; i++) if(max < score[i]) max = score[i];

		for(int i = 0; i < N; i++) {
			sum += score[i]/max*100 ;
		}
		System.out.println(sum/N);
		
	}

}
