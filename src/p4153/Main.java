package p4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;

		while(true) {
			token = new StringTokenizer(reader.readLine()," ");
			int[] num = { 
					Integer.parseInt(token.nextToken())
					,Integer.parseInt(token.nextToken())
					,Integer.parseInt(token.nextToken())
			};

			if(num[0] == 0 || num[1] == 0 || num[2] == 0) break;

			int[] square = {
					(int) Math.pow(num[0], 2)
					,(int) Math.pow(num[1], 2)
					,(int) Math.pow(num[2], 2)
			};

			Arrays.parallelSort(square);

			if(square[0] + square[1] == square[2]) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}

}
